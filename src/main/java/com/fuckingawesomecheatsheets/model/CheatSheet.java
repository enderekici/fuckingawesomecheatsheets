package com.fuckingawesomecheatsheets.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CheatSheet {
    private String name;
    private Collection<String> tags;
    private String comment;
    private String code;
    private String type;
}
