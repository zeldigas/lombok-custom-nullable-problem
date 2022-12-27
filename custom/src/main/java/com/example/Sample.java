package com.example;

import com.example.annotations.Nullable;
import lombok.Value;

@Value
public class Sample {

    @Nullable
    String prop1;

    String prop2;

}
