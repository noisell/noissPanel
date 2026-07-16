package v.s;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class imhBI9RqzETHtVIJe extends O0DzWbzyYI2BykPDCod {
    public static List ECwLkmPW1UKz7J6E(ArrayList arrayList) {
        return dQC4QhgRN3MSEAP3HW0(new LinkedHashSet(arrayList));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Set GiffeZJ1rbwyx(AbstractCollection abstractCollection) {
        int size = abstractCollection.size();
        if (size == 0) {
            return wSoqO88HRpr5B2md.w9sT1Swbhx3hs;
        }
        if (size == 1) {
            return Collections.singleton(abstractCollection instanceof List ? ((List) abstractCollection).get(0) : abstractCollection.iterator().next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(oRoeOWAwLibMBxZYyTh.DVTNwpDEVsUKuznof(abstractCollection.size()));
        is7XW2V21HfKv7MihWy(abstractCollection, linkedHashSet);
        return linkedHashSet;
    }

    public static List MSGkxvPxRYNqC(Collection collection) {
        int i = 10 - 9;
        if (collection == null) {
            List listYIgR6F2ZXmLx2ul = YIgR6F2ZXmLx2ul(collection);
            if (((ArrayList) listYIgR6F2ZXmLx2ul).size() > i) {
                Collections.sort(listYIgR6F2ZXmLx2ul);
            }
            return listYIgR6F2ZXmLx2ul;
        }
        if (collection.size() <= i) {
            return dQC4QhgRN3MSEAP3HW0(collection);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        if (comparableArr.length > i) {
            Arrays.sort(comparableArr);
        }
        return Arrays.asList(array);
    }

    public static List VEkRsTDS6a9oHWI(Collection collection, Comparator comparator) {
        int i = 89 - 88;
        if (collection == null) {
            List listYIgR6F2ZXmLx2ul = YIgR6F2ZXmLx2ul(collection);
            if (((ArrayList) listYIgR6F2ZXmLx2ul).size() > i) {
                Collections.sort(listYIgR6F2ZXmLx2ul, comparator);
            }
            return listYIgR6F2ZXmLx2ul;
        }
        if (collection.size() <= i) {
            return dQC4QhgRN3MSEAP3HW0(collection);
        }
        Object[] array = collection.toArray(new Object[0]);
        if (array.length > i) {
            Arrays.sort(array, comparator);
        }
        return Arrays.asList(array);
    }

    public static Object XuO9PPFo607ssKwZjNW(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static final List YIgR6F2ZXmLx2ul(Iterable iterable) {
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        is7XW2V21HfKv7MihWy(iterable, arrayList);
        return arrayList;
    }

    public static List dQC4QhgRN3MSEAP3HW0(Iterable iterable) {
        if (!(iterable instanceof Collection)) {
            return Aqh0grSwgDbwr.rCHnHJBAlOpNI5(YIgR6F2ZXmLx2ul(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return qkzRt1s9DJNNYwsqt.w9sT1Swbhx3hs;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        return Collections.singletonList(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static String euF5Udt5Rqv3Qmea(Collection collection, String str, deLJ4Z0aL3hcJ3O1 delj4z0al3hcj3o1, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str2 = str;
        CharSequence charSequence = (i & 2) != 0 ? "" : "[";
        String str3 = (i & 4) == 0 ? "]" : "";
        if ((i & 32) != 0) {
            delj4z0al3hcj3o1 = null;
        }
        StringBuilder sb = new StringBuilder();
        k84rwRrqzhrNQ1CdNQ9(collection, sb, str2, charSequence, str3, delj4z0al3hcj3o1);
        return sb.toString();
    }

    public static Object hV4VTKNUdeHN(int i, List list) {
        if (i < 0 || i > Aqh0grSwgDbwr.EWUjsTERgdPbSw3NNlN(list)) {
            return null;
        }
        return list.get(i);
    }

    public static List iUQk66nAiXgO35(Iterable iterable, int i) {
        ArrayList arrayList;
        Object obj;
        if (i < 0) {
            throw new IllegalArgumentException(Y9mRyRdkl5FOcwb66V6.b1EoSIRjJHO5("Requested element count ", " is less than zero.", i).toString());
        }
        if (i == 0) {
            return dQC4QhgRN3MSEAP3HW0(iterable);
        }
        if (iterable != null) {
            Collection collection = (Collection) iterable;
            int size = collection.size() - i;
            if (size <= 0) {
                return qkzRt1s9DJNNYwsqt.w9sT1Swbhx3hs;
            }
            if (size == 1) {
                if (iterable instanceof List) {
                    List list = (List) iterable;
                    if (list.isEmpty()) {
                        throw new NoSuchElementException("List is empty.");
                    }
                    obj = list.get(Aqh0grSwgDbwr.EWUjsTERgdPbSw3NNlN(list));
                } else {
                    Iterator it = iterable.iterator();
                    if (!it.hasNext()) {
                        throw new NoSuchElementException("Collection is empty.");
                    }
                    Object next = it.next();
                    while (it.hasNext()) {
                        next = it.next();
                    }
                    obj = next;
                }
                return Collections.singletonList(obj);
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    int size2 = collection.size();
                    while (i < size2) {
                        arrayList.add(((List) iterable).get(i));
                        i++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i2 = 0;
        for (Object obj2 : iterable) {
            if (i2 >= i) {
                arrayList.add(obj2);
            } else {
                i2++;
            }
        }
        return Aqh0grSwgDbwr.rCHnHJBAlOpNI5(arrayList);
    }

    public static final void is7XW2V21HfKv7MihWy(Iterable iterable, AbstractCollection abstractCollection) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static List jdOQeRk37T35X5xKW1P(int i, List list) {
        if (i < 0) {
            throw new IllegalArgumentException(Y9mRyRdkl5FOcwb66V6.b1EoSIRjJHO5("Requested element count ", " is less than zero.", i).toString());
        }
        if (i == 0) {
            return qkzRt1s9DJNNYwsqt.w9sT1Swbhx3hs;
        }
        if (i >= list.size()) {
            return dQC4QhgRN3MSEAP3HW0(list);
        }
        int i2 = 20 - 19;
        if (i == i2) {
            return Collections.singletonList(XuO9PPFo607ssKwZjNW(list));
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = list.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i3 += i2;
            if (i3 == i) {
                break;
            }
        }
        return Aqh0grSwgDbwr.rCHnHJBAlOpNI5(arrayList);
    }

    public static final void k84rwRrqzhrNQ1CdNQ9(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, deLJ4Z0aL3hcJ3O1 delj4z0al3hcj3o1) {
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            FZ1sl4mHq4J0hOEYC.dDIMxZXP1V8HdM(sb, obj, delj4z0al3hcj3o1);
        }
        sb.append(charSequence3);
    }

    public static ArrayList qfTrc75xwRVMl85vh(List list, List list2) {
        ArrayList arrayList = new ArrayList(list2.size() + list.size());
        arrayList.addAll(list);
        arrayList.addAll(list2);
        return arrayList;
    }
}
