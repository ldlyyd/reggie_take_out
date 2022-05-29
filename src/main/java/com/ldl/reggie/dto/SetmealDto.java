package com.ldl.reggie.dto;

import com.ldl.reggie.entity.Setmeal;
import com.ldl.reggie.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
