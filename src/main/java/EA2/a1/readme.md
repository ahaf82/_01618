## Questions from the university
### a) Welche Datentypen werden verwendet? Welche davon sind Basisdatentypen?
Datentypen sind: 
- Classes/Objects: Foo, Bar, String und Object
- Basistypen/Primitives sind: int, char

### b) Welche Konstanten enthält das Programm?
Das char c ist als static deklariert und damit als Kosntante zu betrachten.

###c) Welche benannten Konstanten sind enthalten?
Das char c.

###d) Welche Variablendeklarationen finden Sie?
Deklariert werden intx, char c, Object y in SubKlasse Bar().

###e) Welche formalen Parameter können Sie entdecken?
Formale Parameter sind: intx bei Constructor Foo(int x), Foo foo in der Methode m und deren Überladung mit den Paramtern String foo.

###f) Welche Attribute sind zu finden? Unterscheiden Sie in Objekt- und Klassenattribute.
Objectattributes sind: Foo.x, sowie Object y für die Subklasse Bar. Klassenattribut ist das char c der Klasse Foo.

###g) Welche Konstruktoren sind zu finden?
Die Klasse hat den überladenen Konstruktur Foo(). Die SubKlasse Bar hat Bar() als Konstruktor.

###h) Welche Methoden sind zu finden? Unterscheiden Sie in Objekt- und Klassenmethoden.
- Es gibt keine Klassenmethoden, weil keine statics methods vorhanden sind.
- Objectmethoden sind hier void m der Subklasse Bar.

###i) Wo finden Überladungen statt?
Bei dem Konstruktor von Foo wird überladen, sowie bei der Methode m von Bar.

###j) In welchen Methoden kann bzw. könnte man auf das Attribut y zugreifen?
- Object y liegt im Scope von Bar und kann von allen Methoden von Bar zugegriffen werden.
- Aus der Elternklasse könnte es per Instanziierung von Foo, dann Bar zugegriffen werden

```
Foo foo = new Foo();
Foo.Bar bar = foo.new Bar();
Object whyButWhy = bar.y;
```

### 2)

Angenommen, im obigen Beispiel würde in der Klasse Foo die folgende innere Klasse eingefügt:
```
static class X {
    void n() {
        System.out.println(x);  
        System.out.println(c);        
    }
}
```

Welche der folgenden Aussagen ist korrekt?

Der Compiler meldet keinen Fehler.
Der Compiler meldet genau einen Fehler und zwar bzgl. der Zeile, in der auf x zugegriffen wird.
Der Compiler meldet genau einen Fehler und zwar bzgl. der Zeile, in der auf c zugegriffen wird.
Der Compiler meldet zwei Fehler, einen für die Zeile, in der auf x und einen für die Zeile, in der auf c zugegriffen wird.
Begünden Sie Ihre Antwort!

Antwort: x(lowercase) ist fresh out of scope weil X(uppercase) statisch deklariert ist.