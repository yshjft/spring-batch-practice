package io.springbatch.springbatchfirst;

import lombok.Data;

public class Member {
    private String id;

    public Member() {
    }

    public Member(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
