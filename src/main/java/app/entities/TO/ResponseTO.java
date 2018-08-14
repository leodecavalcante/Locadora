package app.entities.TO;

import org.springframework.http.HttpStatus;

public class ResponseTO {

    HttpStatus httpStatus;

    public ResponseTO(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }
}
