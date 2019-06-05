package edu.cftic.miparcelable;

import android.os.Parcel;
import android.os.Parcelable;

public class PersonaParcelable implements Parcelable {

    private String nombre;
    private String apellido;
    private int edad;


    public static final Parcelable.Creator<PersonaParcelable> CREATOR = new Parcelable.Creator<PersonaParcelable>(){

        @Override
        public PersonaParcelable createFromParcel(Parcel parcel) {
            return new PersonaParcelable(parcel);
        }

        @Override
        public PersonaParcelable[] newArray(int size) {
            return new PersonaParcelable[size];
        }
    };

    public PersonaParcelable (String nombre, int edad, String apellido)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public PersonaParcelable (Parcel parcel)
    {
        this.nombre = parcel.readString();
        this.apellido = parcel.readString();
        this.edad = parcel.readInt();

    }

    @Override
    public String toString() {
        return this.nombre + " " + this.edad + " " + this.apellido;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.nombre);
        parcel.writeString(this.apellido);
        parcel.writeInt(this.edad);

    }

    @Override
    public int describeContents() {
        return 0;
    }
}