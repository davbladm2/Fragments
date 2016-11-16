package com.example.dm2.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class fragmento_listado extends Fragment {

    private Libro[] datos=new Libro[]{new Libro("¿Cómo, esto también es matemática?","Adrián Paenza","Estamos rodeados, ¡de números! Fecha de nacimiento, número de documento, id de la computadora, teléfono. Números que repetimos automáticamente y recién comienzan a tener sentido cuando los asociamos y logramos pensar distinto.\n" +
                                                    "\n" +
                                                    "Ese es el momento en el que aprendemos a educar la intuición y encontramos así soluciones inesperadas. Desde cómo armar un fixture hasta la estrategia adecuada para nunca perder a las damas. Desde cómo mejorar el tránsito en una gran ciudad hasta cómo realizar menos pasos para armar un rompecabezas. Desde cómo elegir una clave bancaria segura hasta cómo adivinar un número o una carta.\n" +
                                                    "\n" +
                                                    "La lógica matemática envuelve cada uno de nuestros actos cotidianos y es mucho más divertida de lo que imaginábamos\".\n" +
                                                    "\n" +
                                                    "Adrián Paenza nos invita a sumergirnos en el mundo de la matemática recreativa, de la matemágica. Un universo donde se aprende jugando."),
                                new Libro("A Paso de Cangrejo","Umberto Eco","A paso de cangrejo, (es decir, hacia atrás), es como parece caminar la historia en este nuevo milenio.\n" +
                                            "\n" +
                                            "Todos los avances científicos y los progresos democráticos que auguraban un espléndido futuro se han convertido en conflictos e insatisfacciones. El mundo no va bien. Contra esta inquietante situación lanza Umberto Eco sus afilados dardos, sus reflexiones.\n" +
                                            "\n" +
                                            "Tras el 11 de septiembre, la humanidad ha entrado en una peligrosa regresión. Vuelven los viejos conflictos territoriales, las guerras medievales con denominación de \"cruzada\", la nostalgia por los totalitarismos, el antisemitismo y otras formas múltiples de racismo. En muchos lugares del mundo, algunos siguen empeñados en combatir las tesis evolutivas de Darwin.\n" +
                                            "\n" +
                                            "Partiendo de la actitud del gran jurista y politólogo italiano Norberto Bobbio, que enunció los deberes del sabio (\"El deber de los hombres de cultura es hoy más que nunca sembrar dudas, no ya recoger certezas\"), Eco arremete, entre otros asuntos, contra la forma de vida contemporánea, las guerras, la política internacional y el consumo en las grandes superficies como único espacio de ocio posible, sin olvidar el nefasto papel de los medios de comunicación, empeñados en construir una imagen del mundo basada en el espectáculo y la manipulación.\n" +
                                            "\n" +
                                            "El resultado es un libro intenso y combativo cargado de lúcidos análisis sobre el escenario que nos rodea. Una invitación de Eco a pensar sobre el presente y el futuro."),
                                new Libro("Caballo de Fuego","Florencia Bonelli","\"Matilde y Eliah han vuelto a separarse. En el Congo, sus esperanzas de una vida juntos se desvanecieron al ritmo de los celos, las circunstancias hostiles y las bajezas.\n" +
                                            "\n" +
                                            "Matilde, cirujana pediátrica, se refugia en su pasión: el trabajo humanitario que lleva a cabo para la organización Manos Que Curan. Su nuevo destino es la Franja de Gaza, el territorio más densamente poblado del mundo, donde la consigna diaria es sobrevivir. Eliah Al-Saud se impone olvidar a Matilde y acabar con la obsesión que lo ata a ella.\n" +
                                            "\n" +
                                            "En Bagdad, por su parte, Saddam Hussein da los últimos retoques para alcanzar su sueño: convertir a Irak en una potencia nuclear. Y en esta carrera diabólica, Matilde y Eliah se convertirán en piezas clave, debiendo emplearse a fondo no sólo para evitar una catástrofe mundial sino también para salvar la propia vida.\n" +
                                            "\n" +
                                            "A un ritmo frenético y con giros inesperados, Florencia Bonelli pone fin a su exitosa trilogía Caballo de fuego, una apasionante historia donde el espíritu humano trata de imponerse en un mundo presa de la violencia y el terrorismo, aunque también lleno de bondad y solidaridad\"."),
                                new Libro("El Hobbit","J.R.R. Tolkien","Un gran clásico moderno y el preludio a las vastas y poderosas mitologías de El Señor de Los Anillos.\n" +
                                            "\n" +
                                            "Cuando alrededor de 1930, J.R.R. Tolkien comenzó a escribir El Hobbit, hacía ya diez años que trabajaba en el vasto panorama mitológico de El Libro de los Relatos, que más tarde se llamaría El Silmarillion.\n" +
                                            "\n" +
                                            "Así como esas crónicas tempranas narraban los mitos inmemoriales de la Primera y Segunda Edad, Tolkien pronto advirtió que El Hobbit iba ordenándose de algún modo como un relato de la Tercera Edad (Gandalf habla del Nigromante en las primeras páginas), aunque las inesperadas aventuras de un pacífico \"hombre del campo\" no parecieran tener mucha relación con las vastas y oscuras mitologías de la Tierra Media.\n" +
                                            "\n" +
                                            "El estilo directo y lineal, con alusiones (que el autor deploró más tarde) a un público infantil, no impide la poderosa irrupción --unas pocas veces en términos de comedia-- de los grandes temas tolkienianos (el poder, la codicia, la guerra, la muerte) que reaparecerían en una dimensión a menudo obviamente épica en El Señor de los Anillos."),
                                new Libro("Puro Fútbol","Roberto Fontanarrosa","A pedido del público, se reúne en este volumen todos los cuentos relacionados con el fútbol escritos hasta ahora por Fontanarrosa e incluidos en sus libros ya publicados.\n" +
                                            "\n" +
                                            "Flechado por la pasión de multitudes desde siempre y para siempre, Fontanarrosa no sólo es capaz de quedarse en su habitación de hotel en una soleada tarde de París porque televisan un partido entre el Galatasaray y Feyenoord (además, amistoso), sino que practicó hasta hace muy poco tiempo el fútbol amateur en ligas barriales de su Rosario natal.Y, como rosarino, hizo su opción: entre leprosos y canallas, eligió a éstos como una instancia vital. Pocos ignoran que es hincha de Rosario Central, pero esta devoción no le impide disfrutar con las artes futbolísticas de cualquier equipo de las exhiba, así fuere parándose ante un baldío donde los arcos están marcados por bolsos.\n" +
                                            "\n" +
                                            "De nada serviría toda esta formación si el excepcional oído, la imaginación y el humor desbordante del Negro; su captación de la jerga coloquial de los aficionados el instrumento; los argumentos vienen de un enriquecimiento de la realidad coloreada con la sátira y el pastiche, esto último a partir de los estereotipos de los periodistas deportivos.\n" +
                                            "\n" +
                                            "Desde los cuentos primeros, incluidos en Los trenes matan a los autos, hasta los más recientes, de Una lección de vida, se traza una parábola de la que gozarán tanto los devotos de Hemingway como los seguidores de Víctor Hugo Morales; sin pasar por alto, eso sí, a quienes comulgan ante el altar de Aldo Pedro Poy."),};

    Integer[] imgid={
            R.mipmap.ic_adrianpaenza,
            R.mipmap.ic_umbertoeco,
            R.mipmap.ic_florenciabonelli,
            R.mipmap.ic_tolkien,
            R.mipmap.ic_robertofontanarrosa,
    };
    private ListView listaLibro;

    private LibrosListener listener;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_fragmento_listado,container,false);
    }

    public void onActivityCreated(Bundle state) {
        super.onActivityCreated(state);

        listaLibro=(ListView)getView().findViewById(R.id.listaLibro);
        listaLibro.setAdapter(new AdapterLibros(this));
        listaLibro.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long id) {
                if(listener!=null)
                    listener.onLibroSeleccionado((Libro)listaLibro.getAdapter().getItem(pos));
            }
        });
    }

    class AdapterLibros extends ArrayAdapter<Libro>{
        Activity context;
        AdapterLibros(Fragment context){
            super(context.getActivity(),R.layout.activity_listitem_libro,datos);
            this.context=context.getActivity();
        }

        public View getView(int position, View convertView, ViewGroup parent){
            LayoutInflater inflater=context.getLayoutInflater();
            View item=inflater.inflate(R.layout.activity_listitem_libro,null);

            ImageView image=(ImageView) item.findViewById(R.id.icon);
            image.setImageResource(imgid[position]);

            TextView lblTitulo=(TextView) item.findViewById(R.id.lblTitulo);
            lblTitulo.setText(datos[position].getTitulo());

            TextView lblAutor=(TextView) item.findViewById(R.id.lblAutor);
            lblAutor.setText(datos[position].getAutor());

            return item;
        }
    }

    public interface LibrosListener{
        void onLibroSeleccionado(Libro l);
    }

    public void setLibrosListener(LibrosListener listener){
        this.listener=listener;
    }
}
