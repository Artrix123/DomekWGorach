
## Zmiana zdjecia w ***ImageView***

```
xml > app:srcCompat="@drawable/mercedes"

java > imageViewPyt.setImageResource(R.drawable.mercedes);
```
## Zapisywanie zmiennych po obroceniu ekranu

```
@Override
protected void onSaveInstanceState(@NonNull Bundle outState) {
    super.onSaveInstanceState(outState);

    outState.putInt("POINTS", licznik);
    
    ArrayList<Integer> listaInt = new ArrayList<>();
    outState.putIntegerArrayList("LISTA_INT", listaInt);

    ArrayList<String> listaStr = new ArrayList<>();
    outState.putStringArrayList("LISTA_STR", listaStr);
}
```

## ***Log.i***

```
Log.i("CZAS_ZYCIA", "Wywolana metoda onCreate");
```

## Pobieranie zapisanych zmiennych po obroceniu ekranu

```
if(savedInstanceState != null){
    licznik = savedInstanceState.getInt("POINTS");
}
```
