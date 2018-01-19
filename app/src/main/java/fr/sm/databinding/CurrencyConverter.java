package fr.sm.databinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;


public class CurrencyConverter extends BaseObservable{

    private Double euroValue = 0.0;
    private Double yenValue = 0.0;

    private final Double convertRate = 135.86;

    public CurrencyConverter() {
    }

    @Bindable
    public String getEuroValue() {
        return String.valueOf(euroValue);
    }

    public CurrencyConverter setEuroValue(String euroValue) {
        if(euroValue != ""){
            this.euroValue = Double.valueOf(euroValue);
            this.yenValue = this.euroValue * convertRate;

            notifyPropertyChanged(BR.yenValue);
        }
        return this;
    }

    @Bindable
    public String getYenValue() {
        return String.valueOf(yenValue);
    }

    public CurrencyConverter setYenValue(String yenValue) {
        this.yenValue = Double.valueOf(yenValue);
        return this;
    }
}
