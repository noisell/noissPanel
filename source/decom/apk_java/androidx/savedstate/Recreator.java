package androidx.savedstate;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.SavedStateHandleController;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import v.s.D0BFEoQie0iVThYGATm;
import v.s.Jf9nGec8iqajtj;
import v.s.Nb7UID66gn18B;
import v.s.NxoJLFH7TrhGd5768J;
import v.s.OGI3jG3mkhPSTcSz;
import v.s.Xdb7JFhCToIIjDFJDI;
import v.s.Xu6l0U3w5XcZ8Nkn;
import v.s.YXi81o8aDuocRGiWRO;
import v.s.mIJpk1YW0Wj57i6sI60;
import v.s.p9Dc9HHikKZdWDIj;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class Recreator implements OGI3jG3mkhPSTcSz {
    public final ComponentActivity w9sT1Swbhx3hs;

    public Recreator(ComponentActivity componentActivity) {
        this.w9sT1Swbhx3hs = componentActivity;
    }

    private static /* synthetic */ void jwaismuf() {
    }

    @Override // v.s.OGI3jG3mkhPSTcSz
    public final void dDIMxZXP1V8HdM(Xdb7JFhCToIIjDFJDI xdb7JFhCToIIjDFJDI, Jf9nGec8iqajtj jf9nGec8iqajtj) {
        Object obj;
        boolean z;
        if (jf9nGec8iqajtj != Jf9nGec8iqajtj.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        xdb7JFhCToIIjDFJDI.w9sT1Swbhx3hs().xDyLpEZyrcKVe0(this);
        Bundle bundleDDIMxZXP1V8HdM = ((Nb7UID66gn18B) this.w9sT1Swbhx3hs.Ee8d2j4S9Vm5yGuR.vekpFI4d1Nc4fakF).dDIMxZXP1V8HdM("androidx.savedstate.Restarter");
        if (bundleDDIMxZXP1V8HdM == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleDDIMxZXP1V8HdM.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        int size = stringArrayList.size();
        int i = 0;
        while (i < size) {
            String str = stringArrayList.get(i);
            i++;
            String str2 = str;
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str2, false, Recreator.class.getClassLoader()).asSubclass(YXi81o8aDuocRGiWRO.class);
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    try {
                        ComponentActivity componentActivity = this.w9sT1Swbhx3hs;
                        Xu6l0U3w5XcZ8Nkn xu6l0U3w5XcZ8NknDDIMxZXP1V8HdM = componentActivity.dDIMxZXP1V8HdM();
                        Nb7UID66gn18B nb7UID66gn18B = (Nb7UID66gn18B) componentActivity.Ee8d2j4S9Vm5yGuR.vekpFI4d1Nc4fakF;
                        xu6l0U3w5XcZ8NknDDIMxZXP1V8HdM.getClass();
                        Iterator it = new HashSet(xu6l0U3w5XcZ8NknDDIMxZXP1V8HdM.dDIMxZXP1V8HdM.keySet()).iterator();
                        while (it.hasNext()) {
                            NxoJLFH7TrhGd5768J nxoJLFH7TrhGd5768J = (NxoJLFH7TrhGd5768J) xu6l0U3w5XcZ8NknDDIMxZXP1V8HdM.dDIMxZXP1V8HdM.get((String) it.next());
                            p9Dc9HHikKZdWDIj p9dc9hhikkzdwdij = componentActivity.JXn4Qf7zpnLjP5;
                            HashMap map = nxoJLFH7TrhGd5768J.dDIMxZXP1V8HdM;
                            if (map == null) {
                                obj = null;
                            } else {
                                synchronized (map) {
                                    obj = nxoJLFH7TrhGd5768J.dDIMxZXP1V8HdM.get("androidx.lifecycle.savedstate.vm.tag");
                                }
                            }
                            SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
                            if (savedStateHandleController != null && !(z = savedStateHandleController.w9sT1Swbhx3hs)) {
                                if (z) {
                                    throw new IllegalStateException("Already attached to lifecycleOwner");
                                }
                                savedStateHandleController.w9sT1Swbhx3hs = true;
                                p9dc9hhikkzdwdij.dDIMxZXP1V8HdM(savedStateHandleController);
                                throw null;
                            }
                        }
                        if (!new HashSet(xu6l0U3w5XcZ8NknDDIMxZXP1V8HdM.dDIMxZXP1V8HdM.keySet()).isEmpty()) {
                            if (!nb7UID66gn18B.xDyLpEZyrcKVe0) {
                                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
                            }
                            mIJpk1YW0Wj57i6sI60 mijpk1yw0wj57i6si60 = nb7UID66gn18B.Ee8d2j4S9Vm5yGuR;
                            if (mijpk1yw0wj57i6si60 == null) {
                                mijpk1yw0wj57i6si60 = new mIJpk1YW0Wj57i6sI60(nb7UID66gn18B);
                            }
                            nb7UID66gn18B.Ee8d2j4S9Vm5yGuR = mijpk1yw0wj57i6si60;
                            try {
                                D0BFEoQie0iVThYGATm.class.getDeclaredConstructor(null);
                                mIJpk1YW0Wj57i6sI60 mijpk1yw0wj57i6si61 = nb7UID66gn18B.Ee8d2j4S9Vm5yGuR;
                                if (mijpk1yw0wj57i6si61 != null) {
                                    mijpk1yw0wj57i6si61.dDIMxZXP1V8HdM.add(D0BFEoQie0iVThYGATm.class.getName());
                                }
                            } catch (NoSuchMethodException e) {
                                throw new IllegalArgumentException("Class " + D0BFEoQie0iVThYGATm.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
                            }
                        }
                    } catch (Exception e2) {
                        throw new RuntimeException("Failed to instantiate " + str2, e2);
                    }
                } catch (NoSuchMethodException e3) {
                    throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e3);
                }
            } catch (ClassNotFoundException e4) {
                throw new RuntimeException("Class " + str2 + " wasn't found", e4);
            }
        }
    }
}
