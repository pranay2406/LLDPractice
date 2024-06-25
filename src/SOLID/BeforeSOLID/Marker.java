package SOLID.BeforeSOLID;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
    @Setter
    @AllArgsConstructor
    public class Marker
    {
        int Price;
        String Color;

        @Getter(AccessLevel.NONE)
         String Name;
    }
