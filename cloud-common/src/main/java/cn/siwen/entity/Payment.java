package cn.siwen.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author LY
 * @create 2020-11-02 11:13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    private long id;
    private String serial;
}
