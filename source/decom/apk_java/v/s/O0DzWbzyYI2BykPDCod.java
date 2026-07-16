package v.s;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class O0DzWbzyYI2BykPDCod extends rZ7P2n5hUA05 {
    public static void fivkjwgu2UdAtiY(List list, deLJ4Z0aL3hcJ3O1 delj4z0al3hcj3o1) {
        int iEWUjsTERgdPbSw3NNlN;
        int i = (-89) + 90;
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof buUjKwCmuWSvVXs) && !(list instanceof wOEIJmxcleNgBSsMf3I)) {
                FZ1sl4mHq4J0hOEYC.tne6mXOUFKdd(list, "kotlin.collections.MutableIterable");
                throw null;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Boolean) delj4z0al3hcj3o1.pyu8ovAipBTLYAiKab(it.next())).booleanValue() == i) {
                    it.remove();
                }
            }
            return;
        }
        int i2 = 0;
        xH380dEhDsa5zwemTP it2 = new VUjeMiNYIJhgmVJopga(0, Aqh0grSwgDbwr.EWUjsTERgdPbSw3NNlN(list), i).iterator();
        while (it2.JXn4Qf7zpnLjP5) {
            int iNextInt = it2.nextInt();
            Object obj = list.get(iNextInt);
            if (((Boolean) delj4z0al3hcj3o1.pyu8ovAipBTLYAiKab(obj)).booleanValue() != i) {
                if (i2 != iNextInt) {
                    list.set(i2, obj);
                }
                i2++;
            }
        }
        if (i2 >= list.size() || i2 > (iEWUjsTERgdPbSw3NNlN = Aqh0grSwgDbwr.EWUjsTERgdPbSw3NNlN(list))) {
            return;
        }
        while (true) {
            list.remove(iEWUjsTERgdPbSw3NNlN);
            if (iEWUjsTERgdPbSw3NNlN == i2) {
                return;
            } else {
                iEWUjsTERgdPbSw3NNlN--;
            }
        }
    }

    public static void tne6mXOUFKdd(ArrayList arrayList, Iterable iterable) {
        if (iterable instanceof Collection) {
            arrayList.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
    }
}
