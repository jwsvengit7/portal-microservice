package bookservice.bookservice.exception;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GlobalExceptionResponse {
    private String message;
    private String date;
    private int statusCode;
}
