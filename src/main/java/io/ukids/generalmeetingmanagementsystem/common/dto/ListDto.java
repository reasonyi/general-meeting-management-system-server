package io.ukids.generalmeetingmanagementsystem.common.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ListDto<T> {
    T data;
}
