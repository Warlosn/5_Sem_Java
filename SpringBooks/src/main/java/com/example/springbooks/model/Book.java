package com.example.springbooks.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//контроллер-представление. реквест мэпинг
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private String title;
    private String author;
}
