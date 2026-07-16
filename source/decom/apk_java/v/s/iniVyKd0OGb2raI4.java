package v.s;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class iniVyKd0OGb2raI4 implements pARxL2hv3Xoc, UPLbPDJGTcvz4zO {
    public final Object Ee8d2j4S9Vm5yGuR;
    public final Object JXn4Qf7zpnLjP5;
    public Object ibVTtJUNfrGYbW;
    public final Object vekpFI4d1Nc4fakF;
    public final /* synthetic */ int w9sT1Swbhx3hs;
    public final Object xDyLpEZyrcKVe0;

    public iniVyKd0OGb2raI4(xc6AKez33c65zO xc6akez33c65zo, String str, SzicGcOQovJ1JhxwfLo8 szicGcOQovJ1JhxwfLo8, jb8et6SZeK5TWMrJFxDX jb8et6szek5twmrjfxdx, Map map) {
        this.w9sT1Swbhx3hs = 1;
        this.vekpFI4d1Nc4fakF = xc6akez33c65zo;
        this.JXn4Qf7zpnLjP5 = str;
        this.Ee8d2j4S9Vm5yGuR = szicGcOQovJ1JhxwfLo8;
        this.xDyLpEZyrcKVe0 = map;
    }

    public static iniVyKd0OGb2raI4 ibVTtJUNfrGYbW(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        iniVyKd0OGb2raI4 inivykd0ogb2rai4 = new iniVyKd0OGb2raI4(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) inivykd0ogb2rai4.xDyLpEZyrcKVe0)) {
            try {
                ((ArrayDeque) inivykd0ogb2rai4.xDyLpEZyrcKVe0).clear();
                String string = ((SharedPreferences) inivykd0ogb2rai4.vekpFI4d1Nc4fakF).getString((String) inivykd0ogb2rai4.JXn4Qf7zpnLjP5, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) inivykd0ogb2rai4.Ee8d2j4S9Vm5yGuR)) {
                    String[] strArrSplit = string.split((String) inivykd0ogb2rai4.Ee8d2j4S9Vm5yGuR, -1);
                    int length = strArrSplit.length;
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) inivykd0ogb2rai4.xDyLpEZyrcKVe0).add(str);
                        }
                    }
                    return inivykd0ogb2rai4;
                }
                return inivykd0ogb2rai4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // v.s.UPLbPDJGTcvz4zO
    public zzxeBctTPcbuazkjVgh Ee8d2j4S9Vm5yGuR(QwPxr2jx1iGLmehgkv3g qwPxr2jx1iGLmehgkv3g) {
        if (((Set) this.JXn4Qf7zpnLjP5).contains(qwPxr2jx1iGLmehgkv3g)) {
            return ((UPLbPDJGTcvz4zO) this.ibVTtJUNfrGYbW).Ee8d2j4S9Vm5yGuR(qwPxr2jx1iGLmehgkv3g);
        }
        throw new Sb7Xj3N9U1DQ("Attempting to request an undeclared dependency Provider<" + qwPxr2jx1iGLmehgkv3g + ">.");
    }

    @Override // v.s.UPLbPDJGTcvz4zO
    public zzxeBctTPcbuazkjVgh JXn4Qf7zpnLjP5(Class cls) {
        return Ee8d2j4S9Vm5yGuR(QwPxr2jx1iGLmehgkv3g.dDIMxZXP1V8HdM(cls));
    }

    public fUH025aw0Rgl b1EoSIRjJHO5() {
        fUH025aw0Rgl fuh025aw0rgl = new fUH025aw0Rgl();
        fuh025aw0rgl.JXn4Qf7zpnLjP5 = new LinkedHashMap();
        fuh025aw0rgl.dDIMxZXP1V8HdM = (xc6AKez33c65zO) this.vekpFI4d1Nc4fakF;
        fuh025aw0rgl.w9sT1Swbhx3hs = (String) this.JXn4Qf7zpnLjP5;
        Map map = (Map) this.xDyLpEZyrcKVe0;
        fuh025aw0rgl.JXn4Qf7zpnLjP5 = map.isEmpty() ? new LinkedHashMap() : new LinkedHashMap(map);
        fuh025aw0rgl.vekpFI4d1Nc4fakF = ((SzicGcOQovJ1JhxwfLo8) this.Ee8d2j4S9Vm5yGuR).vekpFI4d1Nc4fakF();
        return fuh025aw0rgl;
    }

    @Override // v.s.UPLbPDJGTcvz4zO
    public Object dDIMxZXP1V8HdM(Class cls) {
        if (!((Set) this.vekpFI4d1Nc4fakF).contains(QwPxr2jx1iGLmehgkv3g.dDIMxZXP1V8HdM(cls))) {
            throw new Sb7Xj3N9U1DQ("Attempting to request an undeclared dependency " + cls + ".");
        }
        Object objDDIMxZXP1V8HdM = ((UPLbPDJGTcvz4zO) this.ibVTtJUNfrGYbW).dDIMxZXP1V8HdM(cls);
        if (!cls.equals(yYsb265FRg8Jt.class)) {
            return objDDIMxZXP1V8HdM;
        }
        return new NDA35djX4ShnPDh0mV();
    }

    @Override // v.s.RZKLDkRu6ZWDxTDL71X
    public Object get() {
        return new UBF3HNWZ5b6WVJP1((Executor) ((RZKLDkRu6ZWDxTDL71X) this.vekpFI4d1Nc4fakF).get(), (VxNS64aU1fc3I) ((RZKLDkRu6ZWDxTDL71X) this.JXn4Qf7zpnLjP5).get(), (eTeIZwLyooQrZ0ICI9i) ((UWYuX9UTvV9YpFO4TOW) this.ibVTtJUNfrGYbW).get(), (qAHCZrfOx8WOS) ((RZKLDkRu6ZWDxTDL71X) this.Ee8d2j4S9Vm5yGuR).get(), (WwqoyKhrbNp5qcng0CM) ((RZKLDkRu6ZWDxTDL71X) this.xDyLpEZyrcKVe0).get());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [char, int] */
    /* JADX WARN: Type inference failed for: r2v12, types: [char, int] */
    public String toString() {
        switch (this.w9sT1Swbhx3hs) {
            case 1:
                Map map = (Map) this.xDyLpEZyrcKVe0;
                StringBuilder sb = new StringBuilder("Request{method=");
                sb.append((String) this.JXn4Qf7zpnLjP5);
                sb.append(", url=");
                sb.append((xc6AKez33c65zO) this.vekpFI4d1Nc4fakF);
                SzicGcOQovJ1JhxwfLo8 szicGcOQovJ1JhxwfLo8 = (SzicGcOQovJ1JhxwfLo8) this.Ee8d2j4S9Vm5yGuR;
                if (szicGcOQovJ1JhxwfLo8.size() != 0) {
                    sb.append(", headers=[");
                    int i = 0;
                    for (Object obj : szicGcOQovJ1JhxwfLo8) {
                        int i2 = i + 1;
                        if (i < 0) {
                            Aqh0grSwgDbwr.O2DHNSIGZlgPja7eqLgn();
                            throw null;
                        }
                        yI1KTRoNlsjx yi1ktronlsjx = (yI1KTRoNlsjx) obj;
                        String str = (String) yi1ktronlsjx.w9sT1Swbhx3hs;
                        String str2 = (String) yi1ktronlsjx.vekpFI4d1Nc4fakF;
                        if (i > 0) {
                            sb.append(", ");
                        }
                        sb.append(str);
                        sb.append(':');
                        sb.append(str2);
                        i = i2;
                    }
                    sb.append((char) (28 + 65));
                }
                if (!map.isEmpty()) {
                    sb.append(", tags=");
                    sb.append(map);
                }
                sb.append((char) (64 + 61));
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // v.s.UPLbPDJGTcvz4zO
    public Object vekpFI4d1Nc4fakF(QwPxr2jx1iGLmehgkv3g qwPxr2jx1iGLmehgkv3g) {
        if (((Set) this.vekpFI4d1Nc4fakF).contains(qwPxr2jx1iGLmehgkv3g)) {
            return ((UPLbPDJGTcvz4zO) this.ibVTtJUNfrGYbW).vekpFI4d1Nc4fakF(qwPxr2jx1iGLmehgkv3g);
        }
        throw new Sb7Xj3N9U1DQ("Attempting to request an undeclared dependency " + qwPxr2jx1iGLmehgkv3g + ".");
    }

    @Override // v.s.UPLbPDJGTcvz4zO
    public Set w9sT1Swbhx3hs(QwPxr2jx1iGLmehgkv3g qwPxr2jx1iGLmehgkv3g) {
        if (((Set) this.Ee8d2j4S9Vm5yGuR).contains(qwPxr2jx1iGLmehgkv3g)) {
            return ((UPLbPDJGTcvz4zO) this.ibVTtJUNfrGYbW).w9sT1Swbhx3hs(qwPxr2jx1iGLmehgkv3g);
        }
        throw new Sb7Xj3N9U1DQ("Attempting to request an undeclared dependency Set<" + qwPxr2jx1iGLmehgkv3g + ">.");
    }

    @Override // v.s.UPLbPDJGTcvz4zO
    public zzxeBctTPcbuazkjVgh xDyLpEZyrcKVe0(QwPxr2jx1iGLmehgkv3g qwPxr2jx1iGLmehgkv3g) {
        if (((Set) this.xDyLpEZyrcKVe0).contains(qwPxr2jx1iGLmehgkv3g)) {
            return ((UPLbPDJGTcvz4zO) this.ibVTtJUNfrGYbW).xDyLpEZyrcKVe0(qwPxr2jx1iGLmehgkv3g);
        }
        throw new Sb7Xj3N9U1DQ("Attempting to request an undeclared dependency Provider<Set<" + qwPxr2jx1iGLmehgkv3g + ">>.");
    }

    public iniVyKd0OGb2raI4(RZKLDkRu6ZWDxTDL71X rZKLDkRu6ZWDxTDL71X, RZKLDkRu6ZWDxTDL71X rZKLDkRu6ZWDxTDL71X2, UWYuX9UTvV9YpFO4TOW uWYuX9UTvV9YpFO4TOW, RZKLDkRu6ZWDxTDL71X rZKLDkRu6ZWDxTDL71X3, RZKLDkRu6ZWDxTDL71X rZKLDkRu6ZWDxTDL71X4) {
        this.w9sT1Swbhx3hs = 0;
        this.vekpFI4d1Nc4fakF = rZKLDkRu6ZWDxTDL71X;
        this.JXn4Qf7zpnLjP5 = rZKLDkRu6ZWDxTDL71X2;
        this.ibVTtJUNfrGYbW = uWYuX9UTvV9YpFO4TOW;
        this.Ee8d2j4S9Vm5yGuR = rZKLDkRu6ZWDxTDL71X3;
        this.xDyLpEZyrcKVe0 = rZKLDkRu6ZWDxTDL71X4;
    }

    public iniVyKd0OGb2raI4(FVxyDmZ6Vklq5C fVxyDmZ6Vklq5C, UPLbPDJGTcvz4zO uPLbPDJGTcvz4zO) {
        this.w9sT1Swbhx3hs = 2;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        Set<kha8vJMg5Bq7MuAMmONj> set = fVxyDmZ6Vklq5C.vekpFI4d1Nc4fakF;
        Set set2 = fVxyDmZ6Vklq5C.ibVTtJUNfrGYbW;
        for (kha8vJMg5Bq7MuAMmONj kha8vjmg5bq7muammonj : set) {
            int i = kha8vjmg5bq7muammonj.vekpFI4d1Nc4fakF;
            int i2 = kha8vjmg5bq7muammonj.w9sT1Swbhx3hs;
            boolean z = i == 0;
            QwPxr2jx1iGLmehgkv3g qwPxr2jx1iGLmehgkv3g = kha8vjmg5bq7muammonj.dDIMxZXP1V8HdM;
            if (z) {
                if (i2 == 2) {
                    hashSet4.add(qwPxr2jx1iGLmehgkv3g);
                } else {
                    hashSet.add(qwPxr2jx1iGLmehgkv3g);
                }
            } else if (i == 2) {
                hashSet3.add(qwPxr2jx1iGLmehgkv3g);
            } else if (i2 == 2) {
                hashSet5.add(qwPxr2jx1iGLmehgkv3g);
            } else {
                hashSet2.add(qwPxr2jx1iGLmehgkv3g);
            }
        }
        if (!set2.isEmpty()) {
            hashSet.add(QwPxr2jx1iGLmehgkv3g.dDIMxZXP1V8HdM(yYsb265FRg8Jt.class));
        }
        this.vekpFI4d1Nc4fakF = Collections.unmodifiableSet(hashSet);
        this.JXn4Qf7zpnLjP5 = Collections.unmodifiableSet(hashSet2);
        Collections.unmodifiableSet(hashSet3);
        this.Ee8d2j4S9Vm5yGuR = Collections.unmodifiableSet(hashSet4);
        this.xDyLpEZyrcKVe0 = Collections.unmodifiableSet(hashSet5);
        this.ibVTtJUNfrGYbW = uPLbPDJGTcvz4zO;
    }

    public iniVyKd0OGb2raI4(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.w9sT1Swbhx3hs = 3;
        this.xDyLpEZyrcKVe0 = new ArrayDeque();
        this.vekpFI4d1Nc4fakF = sharedPreferences;
        this.JXn4Qf7zpnLjP5 = "topic_operation_queue";
        this.Ee8d2j4S9Vm5yGuR = ",";
        this.ibVTtJUNfrGYbW = scheduledThreadPoolExecutor;
    }
}
