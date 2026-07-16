package v.s;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class NR9JYyosoI0WX implements dVB73PopaO1nNOOL, fwrzHh6OVJ8w2rqiVeU {
    public static final LinkedHashMap vekpFI4d1Nc4fakF;
    public static final Map w9sT1Swbhx3hs;
    public final Class dDIMxZXP1V8HdM;

    static {
        List listYTljMGnIibTRdOpSh4 = Aqh0grSwgDbwr.yTljMGnIibTRdOpSh4(JRdueaGIH5g8DVCPba.class, deLJ4Z0aL3hcJ3O1.class, NhN5GSKLYh6STld4.class, dH2v3dH2vcwr1cxQ4F.class, lD7NtjPYi4fA.class, afpdgFP21E3075g19.class, rrpUxIBg3tOuxRd0EaQ.class, Ye1oRx02iWA4TGxsPPAf.class, CMSJoqBgxzapzmh.class, GIj3nj95kUN3fQnpVP.class, tg8ZOD96vWpHZX.class, XWocIFD32E4b4LeCPTk.class, kYHRW8j81vTRm7PDdz.class, OkkgwfZdcRswwK2oz44Z.class, u3wUejK4PF8DLuY4t4J.class, mQGYtYYO4DZG.class, XmBhtEvott57mBERMq.class, IX7KM9uqxzjasZ.class, tVyEQiQQyg8TpCnMq.class, b3IPiYGsteNn2Bl.class, LeI1oXy1scv59Mq20Bew.class, cDvAf0p5vgy2MIi.class, Gu6jLp126d8Say3.class);
        ArrayList arrayList = new ArrayList(D8f4u3NB1PCAS427.xfn2GJwmGqs7kWW(listYTljMGnIibTRdOpSh4));
        int i = 0;
        for (Object obj : listYTljMGnIibTRdOpSh4) {
            int i2 = i + 1;
            if (i < 0) {
                Aqh0grSwgDbwr.O2DHNSIGZlgPja7eqLgn();
                throw null;
            }
            arrayList.add(new yI1KTRoNlsjx((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        w9sT1Swbhx3hs = oRoeOWAwLibMBxZYyTh.K7eEOBPYP9VIoHWTe(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        for (String str : map.values()) {
            map3.put("kotlin.jvm.internal." + KgSM0TsKUpCiuePB.PPWVWMPAUcr9AGNUSxQ(str, str) + "CompanionObject", str.concat(".Companion"));
        }
        for (Map.Entry entry : w9sT1Swbhx3hs.entrySet()) {
            Class cls = (Class) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            map3.put(cls.getName(), "kotlin.Function" + iIntValue);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(oRoeOWAwLibMBxZYyTh.DVTNwpDEVsUKuznof(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            linkedHashMap.put(key, KgSM0TsKUpCiuePB.PPWVWMPAUcr9AGNUSxQ(str2, str2));
        }
        vekpFI4d1Nc4fakF = linkedHashMap;
    }

    public NR9JYyosoI0WX(Class cls) {
        this.dDIMxZXP1V8HdM = cls;
    }

    private static /* synthetic */ void yoqp() {
    }

    @Override // v.s.fwrzHh6OVJ8w2rqiVeU
    public final Class dDIMxZXP1V8HdM() {
        return this.dDIMxZXP1V8HdM;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof NR9JYyosoI0WX) && FZ1sl4mHq4J0hOEYC.J0zjQ7CAgohuxU20eCW6(this).equals(FZ1sl4mHq4J0hOEYC.J0zjQ7CAgohuxU20eCW6((dVB73PopaO1nNOOL) obj));
    }

    public final int hashCode() {
        return FZ1sl4mHq4J0hOEYC.J0zjQ7CAgohuxU20eCW6(this).hashCode();
    }

    public final String toString() {
        return this.dDIMxZXP1V8HdM.toString() + " (Kotlin reflection is not available)";
    }
}
