package com.blockcodedevelopment.messengertest;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import de.hdodenhof.circleimageview.CircleImageView;

public class HolderMessage extends RecyclerView.ViewHolder {

    private TextView nombre, mensaje, hora;
    private CircleImageView fotoMensajePerfil;
    private ImageView fotoMensaje;

    public TextView getNombre() {
        return nombre;
    }

    public void setNombre(TextView nombre) {
        this.nombre = nombre;
    }

    public TextView getMensaje() {
        return mensaje;
    }

    public void setMensaje(TextView mensaje) {
        this.mensaje = mensaje;
    }

    public TextView getHora() {
        return hora;
    }

    public void setHora(TextView hora) {
        this.hora = hora;
    }

    public CircleImageView getFotoMensajePerfil() {
        return fotoMensajePerfil;
    }

    public void setFotoMensajePerfil(CircleImageView fotoMensajePerfil) {
        this.fotoMensajePerfil = fotoMensajePerfil;
    }

    public ImageView getFotoMensaje() {
        return fotoMensaje;
    }

    public void setFotoMensaje(ImageView fotoMensaje) {
        this.fotoMensaje = fotoMensaje;
    }

    public HolderMessage (View itemView){

        super (itemView);

        nombre = itemView.findViewById(R.id.nombreMensaje);
        mensaje = itemView.findViewById(R.id.mensajeMensaje);
        hora = itemView.findViewById(R.id.horaMensaje);
        fotoMensajePerfil = itemView.findViewById(R.id.fotoPerfilMensaje);
        fotoMensaje = itemView.findViewById(R.id.mensajeFoto);



    }
}
