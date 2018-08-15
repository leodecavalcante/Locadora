package app.entities.TO;

import org.springframework.http.HttpStatus;

public class ResponseTO {

    private HttpStatus httpStatus;

    private String responseDescription;

    public ResponseTO() {
    }

    public ResponseTO(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public ResponseTO(HttpStatus httpStatus, String responseDescription) {
        this.httpStatus = httpStatus;
        this.responseDescription = responseDescription;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getResponseDescription() {
        return responseDescription;
    }

    public void setResponseDescription(String responseDescription) {
        this.responseDescription = responseDescription;
    }
}
