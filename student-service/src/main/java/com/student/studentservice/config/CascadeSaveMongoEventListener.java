package com.student.studentservice.config;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;
import org.springframework.stereotype.Component;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;

@Component
@RequiredArgsConstructor
public class CascadeSaveMongoEventListener extends AbstractMongoEventListener<Object> {
    private final MongoOperations mongoOperations;
    @Override
    public void onBeforeConvert(BeforeConvertEvent<Object> event) {
        Object source = event.getSource();
        if (source != null) {
            FieldCallback callback = new FieldCallback(source);
            ReflectionUtils.doWithFields(source.getClass(), callback);
        }
    }
    private class FieldCallback implements ReflectionUtils.FieldCallback {
        private final Object source;
        public FieldCallback(Object source) {
            this.source = source;
        }

        @Override
        public void doWith(Field field) throws IllegalArgumentException, IllegalAccessException {
            ReflectionUtils.makeAccessible(field);
            if (field.isAnnotationPresent(CascadeSave.class)) {
                Object fieldValue = field.get(source);
                if (fieldValue != null) {
                    mongoOperations.save(fieldValue);
                }
            }
        }
    }
}
