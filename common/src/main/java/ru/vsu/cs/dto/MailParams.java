package ru.vsu.cs.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MailParams {

    private String id;

    private String emailTo;
}
