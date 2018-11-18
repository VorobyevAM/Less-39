package myArray;

import java.sql.Array;

public class MyArrays {
    private String[] surname = {"Петров","Иванов","Сидоров","Чесноков","Сергеев","Майоров",
            "Лунев","Синицин","Глушаков","Карпин"};

    private String[] firstname = {"Максим","Петр","Висилий","Андрей","Сергей","Иван",
            "Михаил","Антон","Дмитрий","Александр"};

    private String[] secondname = {"Игоревич","Михайлович","Антонович","Сергеевич","Александрович",
            "Денисович","Витальевич","Станиславович","Иванович","Петрович"};

    public String getSurname(int number){
        for (int i = 0; i < surname.length; i++) {
            if (number==i){
                return surname[i];
            }
        }
        return null;
    }

    public String getFirstname(int number){
        for (int i = 0; i < firstname.length; i++) {
            if (number==i){
                return firstname[i];
            }
        }
        return null;
    }

    public String getSecondname(int number){
        for (int i = 0; i < secondname.length; i++) {
            if (number==i){
                return secondname[i];
            }
        }
        return null;
    }

}

