package com.letscode.enumerator;

import lombok.Getter;

@Getter
public enum Size {
    S("Small"), M("Medium"), L("Large");

    private final String label;
    Size (String label){
        this.label = label;
    }
}
