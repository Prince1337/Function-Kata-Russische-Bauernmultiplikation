Function Kata „Russische Bauernmultiplikation“
Schreibe eine Funktion, die zwei ganze Zahlen mit dem Algorithmus „russische Bauernmultiplikation“ multipliziert.

Die Signatur der Methode sieht wie folgt aus:

int Mul(int x, int y);
Der Algorithmus der sogenannten Russischen Bauernmultiplikation verläuft wie folgt: man halbiert die linke der beiden Zahlen so lange, bis die 1 erreicht ist. Nachkommastellen werden abgerundet. Die rechte Zahl wird jeweils daneben geschrieben und verdoppelt. Von den rechten Zahlen werden alle gestrichen, neben denen links eine gerade Zahl steht. Die verbleibenden nicht gestrichenen Zahlen der rechten Seite werden dann addiert und bilden das Ergebnis der Multiplikation.