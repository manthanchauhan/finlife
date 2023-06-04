package com.manthan.finlife.response;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseBody {
    @Setter(AccessLevel.NONE)
    private Integer status;
    private String message;
    private Object data;
}
