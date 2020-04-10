package com.example.countru.capital;

public enum Country {
    ANTIGUA_I_BARBUDA("Saint John's"),
    BAHAMY("Nassau"),
    BARBADOS("Bridgetown"),
    BELIZE("Belmopan"),
    DOMINIKA("Roseau"),
    DOMINIKANA("Santo Domingo"),
    GRENADA("Saint George's"),
    GWATEMALA("Gwatemala"),
    HAITI("Port-au-Prince"),
    HONDURAS("Tegucigalpa"),
    JAMAJKA("Kingston"),
    KANADA("Ottawa"),
    KOSTARYKA("San Jose"),
    KUBA("Hawana"),
    MEKSYK("Meksyk"),
    NIKARAGUA("Managua"),
    PANAMA("Panama"),
    SAINT_KITTS_I_NEVIS("Basseterre"),
    SAINT_LUCIA("Castries"),
    SAINT_VINCENT_I_GRENADYNY("Kingstown"),
    SALWADOR("San Salvador"),
    STANY_ZJEDNOCZONE("Waszyngton"),
    ;

    private final String capital;

    Country(String capital) {
        this.capital = capital;
    }

    @Override
    public String toString() {
        return super.toString() +", capital = '" + capital + '\'';
    }
}


