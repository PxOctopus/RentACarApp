package com.cagri.arackiralama.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum ErrorType {

    BAD_REQUEST_ERROR(1001, "Girilen bilgiler eksik ya da yanlıştır.",HttpStatus.BAD_REQUEST),
    INTERNAL_SERVER_ERROR(9998,"Sunucuda beklenmeyen bir hata oluştu, Lütfen tekrar deneyiniz",HttpStatus.INTERNAL_SERVER_ERROR),
    INTERNAL_SERVER_ERROR_NOT_FOUND_DATA(1002,"Sunucu Hatası: Liste getirilemedi, lütfen tekrar deneyin", HttpStatus.INTERNAL_SERVER_ERROR),
    CUSTOMER_INVALID_PARAMETER_ERROR(1003, "Musteri parametreleri eksik ya da hatali, lutfen bilgileri eksiksiz giriniz", HttpStatus.BAD_REQUEST ),
    VEHICLE_NOT_FOUND_ID_ERROR(1002, "Girilen arac id'si kayitli degildir, lutfen tekrar deneyiniz!", HttpStatus.BAD_REQUEST);


    private Integer code;
    private String message;
    private HttpStatus httpStatus;
}
