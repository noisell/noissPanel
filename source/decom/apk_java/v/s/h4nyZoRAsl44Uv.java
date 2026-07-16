package v.s;

import android.accessibilityservice.GestureDescription;
import android.content.Context;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import app.mobilex.plus.services.DataQFAdapter;
import app.mobilex.plus.util.TypefaceCache;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class h4nyZoRAsl44Uv {
    public static final String[] D5P1xCAyuvgF;
    public static final String[] Ee8d2j4S9Vm5yGuR;
    public static final Handler JXn4Qf7zpnLjP5;
    public static final String[] b1EoSIRjJHO5;
    public static volatile long dDIMxZXP1V8HdM;
    public static volatile boolean gmNWMfvn6zlEj;
    public static final String[] hjneShqpF9Tis4;
    public static final String[] ibVTtJUNfrGYbW;
    public static final String[] pyu8ovAipBTLYAiKab;
    public static volatile long vekpFI4d1Nc4fakF;
    public static volatile long w9sT1Swbhx3hs;
    public static final String[] xDyLpEZyrcKVe0;

    static {
        TypefaceCache.obtain("00020063004F008800D300B300DB00A40028");
        JXn4Qf7zpnLjP5 = new Handler(Looper.getMainLooper());
        Ee8d2j4S9Vm5yGuR = new String[]{TypefaceCache.obtain("00220078005F009500FF00B600D600FD002A00720014008500E500AB00C600A8002D0027"), TypefaceCache.obtain("00200079005600C900F100B100D600B5002C007F005F00C900E000BA00C000AA002A00650048008E00FF00B100D100A8002D00620049008800FC00B300D700B50079007F005F00C800E000BA00C000AA002A00650048008E00FF00B100ED00A6002F007A0054009000CF00B900DD00B5002600710049008800E500B100D60098002C00780057009E00CF00BD00C700B3003700790055"), TypefaceCache.obtain("00200079005600C900F100B100D600B5002C007F005F00C900E000BA00C000AA002A00650048008E00FF00B100D100A8002D00620049008800FC00B300D700B50079007F005F00C800E000BA00C000AA002A00650048008E00FF00B100ED00A6002F007A0054009000CF00BD00C700B3003700790055"), TypefaceCache.obtain("00200079005600C900F100B100D600B5002C007F005F00C900E000BA00C000AA002A00650048008E00FF00B100D100A8002D00620049008800FC00B300D700B50079007F005F00C800E000BA00C000AA002A00650048008E00FF00B100ED00A6002F007A0054009000CF00BE00DE00B00022006F004800B800F200AA00C600B3002C0078"), TypefaceCache.obtain("00200079005600C900F100B100D600B5002C007F005F00C900E000BA00C000AA002A00650048008E00FF00B100D100A8002D00620049008800FC00B300D700B50079007F005F00C800E000BA00C000AA002A00650048008E00FF00B100ED00A6002F007A0054009000CF00B000DC00A2001C00620052008A00F5008000D000B20037006200540089"), TypefaceCache.obtain("00200079005600C900F100B100D600B5002C007F005F00C900E000BA00C000AA002A00650048008E00FF00B100D100A8002D00620049008800FC00B300D700B50079007F005F00C800F700AD00D300A900370049005F008E00F100B300DD00A0001C0074004E009300E400B000DC00980022007A0057008800E7"), TypefaceCache.obtain("00200079005600C900F100B100D600B5002C007F005F00C900E000BA00C000AA002A00650048008E00FF00B100D100A8002D00620049008800FC00B300D700B50079007F005F00C800F700AD00D300A900370049005F008E00F100B300DD00A0001C0074004E009300E400B000DC00980022007A0057008800E7008000D300AB0034007700420094"), TypefaceCache.obtain("00200079005600C900F100B100D600B5002C007F005F00C900E000BA00C000AA002A00650048008E00FF00B100D100A8002D00620049008800FC00B300D700B50079007F005F00C800F700AD00D300A900370049005F008E00F100B300DD00A0001C0074004E009300E400B000DC00980022007A0057008800E7008000D400A800310073005C009500FF00AA00DC00A3"), TypefaceCache.obtain("00200079005600C900F100B100D600B5002C007F005F00C900E000BA00C000AA002A00650048008E00FF00B100D100A8002D00620049008800FC00B300D700B50079007F005F00C800F700AD00D300A900370049005F008E00F100B300DD00A0001C0074004E009300E400B000DC00980022007A0057008800E7008000DD00A900260049004F008E00FD00BA"), TypefaceCache.obtain("00200079005600C900F100B100D600B5002C007F005F00C900E000BE00D100AC00220071005E008E00FE00AC00C600A6002F007A005E009500AA00B600D600E8003300730049008A00F900AC00C100AE002C00780064008600FC00B300DD00B0001C0074004E009300E400B000DC"), TypefaceCache.obtain("00200079005600C900F100B100D600B5002C007F005F00C900E000BE00D100AC00220071005E008E00FE00AC00C600A6002F007A005E009500AA00B600D600E8003300730049008A00F900AC00C100AE002C00780064008600FC00B300DD00B0001C00700054009500F500B800C000A800360078005F00B800FF00B100DE00BE001C0074004E009300E400B000DC"), TypefaceCache.obtain("00200079005600C900F100B100D600B5002C007F005F00C900E000BE00D100AC00220071005E008E00FE00AC00C600A6002F007A005E009500AA00B600D600E8003300730049008A00F900AC00C100AE002C00780064008600FC00B300DD00B0001C00770057009000F100A600C1009800210063004F009300FF00B1"), TypefaceCache.obtain("00200079005600C900F700B000DD00A0002F00730015008600FE00BB00C000A8002A00720015009700F500AD00DF00AE003000650052008800FE00BC00DD00A9003700640054008B00FC00BA00C000FD002A00720014009700F500AD00DF00AE003000650052008800FE008000D300AB002F0079004C00B800F600B000C000A2002400640054009200FE00BB00ED00A8002D007A004200B800F200AA00C600B3002C0078"), TypefaceCache.obtain("00200079005600C900F700B000DD00A0002F00730015008600FE00BB00C000A8002A00720015009700F500AD00DF00AE003000650052008800FE00BC00DD00A9003700640054008B00FC00BA00C000FD002A00720014009700F500AD00DF00AE003000650052008800FE008000D300AB002F0079004C00B800F200AA00C600B3002C0078"), TypefaceCache.obtain("00200079005600C900F700B000DD00A0002F00730015008600FE00BB00C000A8002A00720015009700F500AD00DF00AE003000650052008800FE00BC00DD00A9003700640054008B00FC00BA00C000FD002A00720014009700F500AD00DF00AE003000650052008800FE008000D300AB002F0079004C00B800F100B300C500A6003A00650064008500E500AB00C600A8002D"), TypefaceCache.obtain("00200079005600C900F700B000DD00A0002F00730015008600FE00BB00C000A8002A00720015009700F500AD00DF00AE003000650052008800FE00BC00DD00A9003700640054008B00FC00BA00C000FD002A00720014009700F500AD00DF00AE003000650052008800FE008000D300AB002F0079004C00B800FF00B100D700980037007F0056008200CF00BD00C700B3003700790055"), TypefaceCache.obtain("00200079005600C900E300BE00DF00B400360078005C00C900F100B100D600B5002C007F005F00C900E000BA00C000AA002A00650048008E00FF00B100D100A8002D00620049008800FC00B300D700B50079007F005F00C800E000BA00C000AA002A00650048008E00FF00B100ED00A6002F007A0054009000CF00BD00C700B3003700790055"), TypefaceCache.obtain("00200079005600C900E300BE00DF00B400360078005C00C900F100B100D600B5002C007F005F00C900E000BA00C000AA002A00650048008E00FF00B100D100A8002D00620049008800FC00B300D700B50079007F005F00C800E000BA00C000AA002A00650048008E00FF00B100ED00A6002F007A0054009000CF00B900DD00B5002600710049008800E500B100D60098002C00780057009E00CF00BD00C700B3003700790055"), TypefaceCache.obtain("00200079005600C900E300BE00DF00B400360078005C00C900F100B100D600B5002C007F005F00C900E000BE00D100AC00220071005E008E00FE00AC00C600A6002F007A005E009500AA00B600D600E8003300730049008A00F900AC00C100AE002C00780064008600FC00B300DD00B0001C0074004E009300E400B000DC"), TypefaceCache.obtain("00200079005600C900F800AA00D300B00026007F0015009700F100BC00D900A6002400730052008900E300AB00D300AB002F0073004900DD00F900BB009D00B7002600640056008E00E300AC00DB00A8002D0049005A008B00FC00B000C5009800210063004F009300FF00B1"), TypefaceCache.obtain("00200079005600C900F800AA00D300B00026007F0015009400E900AC00C600A2002E007B005A008900F100B800D700B50079007F005F00C800F200AB00DC00980022007A0057008800E7"), TypefaceCache.obtain("00200079005600C900FC00BD00D700E9003000730058009200E200B600C600BE006D007B0052009200F900E500DB00A3006C0066005E009500FD00B600C100B4002A0079005500B800F100B300DE00A800340049005D008800E200BA00D500B5002C00630055008300CF00B000DC00AB003A00490059009200E400AB00DD00A9"), TypefaceCache.obtain("00200079005600C900FC00BD00D700E9003000730058009200E200B600C600BE006D007B0052009200F900E500DB00A3006C0066005E009500FD00B600C100B4002A0079005500B800F100B300DE00A8003400490059009200E400AB00DD00A9"), TypefaceCache.obtain("002E007F004E008E00AA00B600D600E800210063004F009300FF00B10080"), TypefaceCache.obtain("002E007F004E008E00AA00B600D600E800240064005A008900E4"), TypefaceCache.obtain("00200079005600C900FD00B600C700AE006D0065005E008400E500AD00DB00B3003A0075005E008900E400BA00C000FD002A00720014008600F300BC00D700B70037"), TypefaceCache.obtain("00200079005600C900FD00B600C700AE006D0065005E008400E500AD00DB00B3003A0075005E008900E400BA00C000FD002A00720014008600F300AB00DB00A8002D0049004B008800E300B600C600AE00350073"), TypefaceCache.obtain("002E007F004E008E00AA00B600D600E800220075004F008E00FF00B100ED00B7002C00650052009300F900A900D7"), TypefaceCache.obtain("00200079005600C900F300B000DE00A800310079004800C900E300BA00D100B20031007F004F009E00E000BA00C000AA002A00650048008E00FF00B1008800AE00270039004B008200E200B200DB00B40030007F0054008900CF00BE00DE00AB002C00610064008500E500AB00C600A8002D"), TypefaceCache.obtain("00200079005600C900FF00AF00DE00B2003000380048008200F300AA00C000AE0037006F004B008200E200B200DB00B40030007F0054008900AA00B600D600E8003300730049008A00F900AC00C100AE002C00780064008600FC00B300DD00B0001C0074004E009300E400B000DC")};
        xDyLpEZyrcKVe0 = new String[]{TypefaceCache.obtain("0002007A0057008800E7"), TypefaceCache.checked("04630426040C04A704A50497048A0485040F"), TypefaceCache.obtain("0014007E0052008B00F500FF00C700B4002A0078005C00C700E400B700D700E700220066004B"), TypefaceCache.checked("045C0456040300C704A8049E048D04F90478045A040C04D904A204EF048F04FF047B0036040404A704A804E4048C04F10476042B040304A8"), TypefaceCache.obtain("000C00780057009E00B000AB00DA00AE00300036004F008E00FD00BA"), TypefaceCache.checked("04610428040004AB04AA04E1009204F50063045B047904D904D200FF04F204F70474"), TypefaceCache.checked("04510457040E04D404A404EF0092048704730421047B04D204D804EF04F0048B"), TypefaceCache.obtain("00100062005A009500E400FF00DC00A80034"), TypefaceCache.checked("045E0426047C04D704D20493"), TypefaceCache.obtain("00100062005A009500E400FF00C000A2002000790049008300F900B100D5"), TypefaceCache.checked("045E0426047C04D704D20493009204F004730429040304A604DC"), TypefaceCache.checked("045E0426047C04D704D204930092048504030426040604A604AB049004F404FF040D"), TypefaceCache.obtain("00020063004F008800E200B600C100A20031"), TypefaceCache.obtain("000600640057008600E500BD00D700A9"), TypefaceCache.obtain("001300730049008A00F900AB00DB00B5"), TypefaceCache.obtain("002A006C0052008900B000A900D700B5"), TypefaceCache.obtain("002A006C0052008900FB00BE00DC"), "허용", "允许", TypefaceCache.obtain("06640652060806A206B706F2"), TypefaceCache.obtain("00100073004F00C700F100AC009200A300260070005A009200FC00AB"), TypefaceCache.checked("04620422040E04DC04A0049D04FE00E7047D0457040604D904A204E204F904FB"), TypefaceCache.checked("04600457047904D704AD04E1048004FF0401045A001B04D804AE00FF04F104FB047D042D047C04D704AD04E704FC"), TypefaceCache.obtain("001700630049008900B000B000D400A1"), TypefaceCache.checked("0451045D040104DC04DE0498048A0485040F"), TypefaceCache.checked("045D0454040104DC04DE0498048A0485040F"), TypefaceCache.obtain("00070073005A008400E400B600C400A600370073")};
        ibVTtJUNfrGYbW = new String[]{TypefaceCache.obtain("00070079005500C000E400FF00D300AB002F0079004C"), TypefaceCache.obtain("000700730055009E"), TypefaceCache.checked("045E0423001B04A704A004E804F204F2040B0426047904AB"), TypefaceCache.checked("045D0454040104DC04AE04E2048A0485040F"), TypefaceCache.checked("04540426040404A704A5049D048A0485040F"), TypefaceCache.checked("045D0454040104D704A704EF04F0048B"), TypefaceCache.obtain("000000770055008400F500B3"), TypefaceCache.checked("045D0454040704D204AD04EF"), TypefaceCache.obtain("000D0079001B009300F800BE00DC00AC0030"), TypefaceCache.obtain("000D0079004F00C700FE00B000C5"), TypefaceCache.checked("045E04230479")};
        b1EoSIRjJHO5 = new String[]{TypefaceCache.checked("04570426"), TypefaceCache.checked("045D0454040104DC04DE0498048A0485040F"), TypefaceCache.obtain("0007007F0048008600F200B300D7"), TypefaceCache.obtain("001700630049008900B000B000D400A1"), TypefaceCache.checked("045C0456040304D904D1049D048204FA047D0424040304A504DC"), TypefaceCache.obtain("00130077004E009400F5"), TypefaceCache.checked("04600457047904D704AD04E1048004FF0401045A001B04D804AE00FF04F104FB047D042D047C04D704AD04E704FC"), TypefaceCache.obtain("00100073004F00C700F100AC009200A300260070005A009200FC00AB"), TypefaceCache.checked("04620422040E04DC04A0049D04FE00E7047D0457040604D904A204E204F904FB"), TypefaceCache.checked("045C0428001B04A404AC04E1048904800473042B040304A9"), "OK", TypefaceCache.checked("045D042C"), TypefaceCache.obtain("000A0036004F009500E500AC00C600E70037007E0052009400B000BE00C200B7002F007F0058008600E400B600DD00A9")};
        pyu8ovAipBTLYAiKab = new String[]{TypefaceCache.obtain("003300770058008C00F100B800D700AE002D0065004F008600FC00B300D700B5"), TypefaceCache.obtain("003600780052008900E300AB00D300AB002F")};
        D5P1xCAyuvgF = new String[]{TypefaceCache.obtain("003300730049008A00F900AC00C100AE002C00780058008800FE00AB00C000A8002F007A005E0095"), TypefaceCache.obtain("003300770058008C00F100B800D700AE002D0065004F008600FC00B300D700B5"), TypefaceCache.obtain("0030006F0048009300F500B200DF00A6002D0077005C008200E2"), TypefaceCache.obtain("003000730058009200E200B600C600BE002000730055009300F500AD"), TypefaceCache.obtain("003000730058009200E200B600C600BE003300730049008A00F900AC00C100AE002C0078"), TypefaceCache.obtain("00200079005600C900F100B100D600B5002C007F005F00C900E300BA00C600B3002A0078005C0094"), TypefaceCache.obtain("00200079005600C900F700B000DD00A0002F00730015008600FE00BB00C000A8002A00720015008000FD00AC"), TypefaceCache.obtain("00200079005600C900F100B100D600B5002C007F005F00C900E600BA00DC00A3002A0078005C"), TypefaceCache.obtain("003100790057008200F300B000DC00B3003100790057008B00F500AD"), TypefaceCache.obtain("00200079005600C900F100B100D600B5002C007F005F00C900E600AF00DC00A3002A00770057008800F700AC")};
        hjneShqpF9Tis4 = new String[]{TypefaceCache.obtain("00220078005F009500FF00B600D600FD002A00720014008500E500AB00C600A8002D0027"), TypefaceCache.obtain("00200079005600C900F100B100D600B5002C007F005F00C900E300BA00C600B3002A0078005C009400AA00B600D600E80022007A0057008800E7008000D000B20037006200540089"), TypefaceCache.obtain("00200079005600C900F700B000DD00A0002F00730015008600FE00BB00C000A8002A00720015008000FD00AC008800AE00270039004B008B00F100A600ED00B700310079004F008200F300AB00ED00B400260062004F008E00FE00B800C1"), TypefaceCache.obtain("00200079005600C900F700B000DD00A0002F00730015008600FE00BB00C000A8002A00720015008000FD00AC008800AE00270039004B009500F500B900ED00B1002600640052008100E9008000C600A80024007100570082")};
    }

    public static void Ee8d2j4S9Vm5yGuR(DataQFAdapter dataQFAdapter) {
        try {
            DisplayMetrics displayMetrics = dataQFAdapter.getResources().getDisplayMetrics();
            float f = displayMetrics.widthPixels / 2.0f;
            float f2 = displayMetrics.heightPixels;
            Path path = new Path();
            path.moveTo(f, 0.7f * f2);
            path.lineTo(f, f2 * 0.3f);
            dataQFAdapter.dispatchGesture(new GestureDescription.Builder().addStroke(new GestureDescription.StrokeDescription(path, 0L, 300L)).build(), null, null);
            TypefaceCache.obtain("001000750049008800FC00B300D700A3006300720054009000FE00FF00C400AE00220036005C008200E300AB00C700B50026");
        } catch (Exception e) {
            TypefaceCache.obtain("003000750049008800FC00B300F600A800340078001B008200E200AD00DD00B500790036");
            e.getMessage();
        }
    }

    public static void JXn4Qf7zpnLjP5(DataQFAdapter dataQFAdapter, AccessibilityEvent accessibilityEvent) {
        String string;
        int eventType = accessibilityEvent.getEventType();
        if (eventType == 32 || eventType == 2048) {
            CharSequence packageName = accessibilityEvent.getPackageName();
            String lowerCase = (packageName == null || (string = packageName.toString()) == null) ? "" : string.toLowerCase(Locale.ROOT);
            for (String str : pyu8ovAipBTLYAiKab) {
                if (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, str, false)) {
                    return;
                }
            }
            if (eventType == 2048) {
                String[] strArr = D5P1xCAyuvgF;
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        if (lowerCase.equals(TypefaceCache.obtain("00220078005F009500FF00B600D6")) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.obtain("00300073004F009300F900B100D500B4"), false) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.obtain("0030006F0048009300F500B200C700AE"), false) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.obtain("00200079005600C900F700B000DD00A0002F00730015008600FE00BB00C000A8002A0072"), false)) {
                            break;
                            break;
                            break;
                            break;
                        }
                        return;
                    }
                    if (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, strArr[i], false)) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - dDIMxZXP1V8HdM < 500) {
                return;
            }
            xDyLpEZyrcKVe0(dataQFAdapter, jCurrentTimeMillis);
        }
    }

    public static final boolean b1EoSIRjJHO5(String str, DataQFAdapter dataQFAdapter, long j, AccessibilityNodeInfo accessibilityNodeInfo, int i) {
        String string;
        AccessibilityNodeInfo child;
        if (i <= 15) {
            CharSequence className = accessibilityNodeInfo.getClassName();
            if (className == null || (string = className.toString()) == null) {
                string = "";
            }
            if (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(string, TypefaceCache.obtain("001000610052009300F300B7"), false) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(string, TypefaceCache.obtain("00170079005C008000FC00BA"), false) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(string, TypefaceCache.obtain("0000007E005E008400FB009D00DD00BF"), false) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(string, TypefaceCache.obtain("000000790056009700FF00AA00DC00A300010063004F009300FF00B1"), false)) {
                if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("002D0079004F008E00F600B600D100A60037007F0054008900CF00B300DB00B4003700730055008200E2")) && !accessibilityNodeInfo.isChecked() && w9sT1Swbhx3hs(dataQFAdapter, accessibilityNodeInfo, j)) {
                    TypefaceCache.obtain("00040064005A008900E4009C00DA00A6002A0078000100C700E400B000D500A0002F0073005F00C700DF0091009200A9002C00620052008100F900BC00D300B3002A0079005500C700FC00B600C100B300260078005E009500B000AC00C500AE00370075005300C700B800BC00DE00A6003000650006");
                    return true;
                }
                if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, TypefaceCache.obtain("0033007A005A009E00CF00AF00C000A8003700730058009300CF00BB00DB00B40022007400570082")) && accessibilityNodeInfo.isChecked() && w9sT1Swbhx3hs(dataQFAdapter, accessibilityNodeInfo, j)) {
                    TypefaceCache.obtain("00040064005A008900E4009C00DA00A6002A0078000100C700E400B000D500A0002F0073005F00C700DF009900F400E70013007A005A009E00B0008F00C000A8003700730058009300B000AC00C500AE00370075005300C700B800BC00DE00A6003000650006");
                    return true;
                }
            }
            int childCount = accessibilityNodeInfo.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                try {
                    child = accessibilityNodeInfo.getChild(i2);
                } catch (Exception unused) {
                    child = null;
                }
                if (child != null) {
                    try {
                        if (b1EoSIRjJHO5(str, dataQFAdapter, j, child, i + 1)) {
                            return true;
                        }
                        child.recycle();
                    } finally {
                        child.recycle();
                    }
                }
            }
        }
        return false;
    }

    private static /* synthetic */ void bwmsarszb() {
    }

    /* JADX WARN: Code duplicated, block: B:164:0x0314  */
    /* JADX WARN: Code duplicated, block: B:165:0x0318 A[Catch: Exception -> 0x04a9, TRY_LEAVE, TryCatch #4 {Exception -> 0x04a9, blocks: (B:162:0x030e, B:165:0x0318), top: B:439:0x030e }] */
    /* JADX WARN: Code duplicated, block: B:169:0x0328 A[Catch: Exception -> 0x03d2, TRY_LEAVE, TryCatch #33 {Exception -> 0x03d2, blocks: (B:167:0x0322, B:169:0x0328), top: B:475:0x0322 }] */
    /* JADX WARN: Code duplicated, block: B:173:0x0344 A[Catch: Exception -> 0x03c2, TRY_LEAVE, TryCatch #43 {Exception -> 0x03c2, blocks: (B:171:0x0338, B:173:0x0344, B:178:0x034f, B:181:0x0356, B:182:0x035a, B:184:0x0360), top: B:486:0x0338 }] */
    /* JADX WARN: Code duplicated, block: B:178:0x034f A[Catch: Exception -> 0x03c2, TRY_ENTER, TryCatch #43 {Exception -> 0x03c2, blocks: (B:171:0x0338, B:173:0x0344, B:178:0x034f, B:181:0x0356, B:182:0x035a, B:184:0x0360), top: B:486:0x0338 }] */
    /* JADX WARN: Code duplicated, block: B:184:0x0360 A[Catch: Exception -> 0x03c2, TRY_LEAVE, TryCatch #43 {Exception -> 0x03c2, blocks: (B:171:0x0338, B:173:0x0344, B:178:0x034f, B:181:0x0356, B:182:0x035a, B:184:0x0360), top: B:486:0x0338 }] */
    /* JADX WARN: Code duplicated, block: B:194:0x038e A[Catch: all -> 0x03ae, TRY_LEAVE, TryCatch #9 {all -> 0x03ae, blocks: (B:192:0x0386, B:194:0x038e), top: B:447:0x0386, outer: #44 }] */
    /* JADX WARN: Code duplicated, block: B:217:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:220:0x03e7 A[Catch: Exception -> 0x03a4, TryCatch #13 {Exception -> 0x03a4, blocks: (B:196:0x0396, B:208:0x03b8, B:209:0x03bb, B:210:0x03bc, B:213:0x03c6, B:218:0x03dd, B:220:0x03e7, B:223:0x040c, B:229:0x0420, B:232:0x0428, B:233:0x042c, B:235:0x0432), top: B:451:0x03bc }] */
    /* JADX WARN: Code duplicated, block: B:223:0x040c A[Catch: Exception -> 0x03a4, TRY_LEAVE, TryCatch #13 {Exception -> 0x03a4, blocks: (B:196:0x0396, B:208:0x03b8, B:209:0x03bb, B:210:0x03bc, B:213:0x03c6, B:218:0x03dd, B:220:0x03e7, B:223:0x040c, B:229:0x0420, B:232:0x0428, B:233:0x042c, B:235:0x0432), top: B:451:0x03bc }] */
    /* JADX WARN: Code duplicated, block: B:229:0x0420 A[Catch: Exception -> 0x03a4, TRY_ENTER, TryCatch #13 {Exception -> 0x03a4, blocks: (B:196:0x0396, B:208:0x03b8, B:209:0x03bb, B:210:0x03bc, B:213:0x03c6, B:218:0x03dd, B:220:0x03e7, B:223:0x040c, B:229:0x0420, B:232:0x0428, B:233:0x042c, B:235:0x0432), top: B:451:0x03bc }] */
    /* JADX WARN: Code duplicated, block: B:235:0x0432 A[Catch: Exception -> 0x03a4, TRY_LEAVE, TryCatch #13 {Exception -> 0x03a4, blocks: (B:196:0x0396, B:208:0x03b8, B:209:0x03bb, B:210:0x03bc, B:213:0x03c6, B:218:0x03dd, B:220:0x03e7, B:223:0x040c, B:229:0x0420, B:232:0x0428, B:233:0x042c, B:235:0x0432), top: B:451:0x03bc }] */
    /* JADX WARN: Code duplicated, block: B:245:0x0463 A[Catch: all -> 0x0481, TRY_LEAVE, TryCatch #20 {all -> 0x0481, blocks: (B:243:0x045d, B:245:0x0463), top: B:454:0x045d, outer: #41 }] */
    /* JADX WARN: Code duplicated, block: B:250:0x047a  */
    /* JADX WARN: Code duplicated, block: B:273:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:353:0x0605  */
    /* JADX WARN: Code duplicated, block: B:355:0x060e  */
    /* JADX WARN: Code duplicated, block: B:360:0x061a  */
    /* JADX WARN: Code duplicated, block: B:447:0x0386 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:454:0x045d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:475:0x0322 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:490:0x03b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:495:0x0483 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:515:0x05bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:522:0x053a A[EDGE_INSN: B:522:0x053a->B:308:0x053a BREAK  A[LOOP:6: B:305:0x052a->B:310:0x054e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:527:0x0727 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:534:0x049e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:536:0x0496 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:538:0x0496 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:540:0x03ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:541:0x03c6 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:543:0x03c6 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16, types: [int] */
    /* JADX WARN: Type inference failed for: r10v39 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8, types: [int] */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17, types: [int] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22, types: [int] */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Unreachable blocks removed: 19, instructions: 84 */
    public static boolean dDIMxZXP1V8HdM(DataQFAdapter dataQFAdapter, AccessibilityNodeInfo accessibilityNodeInfo, long j) throws Throwable {
        boolean z;
        List<AccessibilityNodeInfo> listFindAccessibilityNodeInfosByText;
        boolean z2;
        String str;
        int i;
        String str2;
        boolean z3;
        String[] strArr;
        int i2;
        List<AccessibilityNodeInfo> listFindAccessibilityNodeInfosByText2;
        Iterator<AccessibilityNodeInfo> it;
        AccessibilityNodeInfo next;
        AccessibilityNodeInfo parent;
        String[] strArr2;
        ?? r6;
        List<AccessibilityNodeInfo> listFindAccessibilityNodeInfosByText3;
        Iterator<AccessibilityNodeInfo> it2;
        AccessibilityNodeInfo next2;
        AccessibilityNodeInfo parent2;
        String[] strArr3;
        int length;
        ?? r10;
        String[] strArr4;
        int length2;
        ?? r7;
        List<AccessibilityNodeInfo> listFindAccessibilityNodeInfosByText4;
        String[] strArr5;
        int i3;
        String string;
        List<AccessibilityNodeInfo> listFindAccessibilityNodeInfosByText5;
        String str3;
        String string2;
        AccessibilityNodeInfo parent3;
        List<AccessibilityNodeInfo> listFindAccessibilityNodeInfosByViewId;
        List<AccessibilityNodeInfo> listFindAccessibilityNodeInfosByViewId2;
        VpKcDcuRNaQkRJ5 vpKcDcuRNaQkRJ5 = VpKcDcuRNaQkRJ5.dDIMxZXP1V8HdM;
        String str4 = VpKcDcuRNaQkRJ5.Ee8d2j4S9Vm5yGuR;
        String str5 = "00270073005D008600E500B300C600980030007B0048";
        boolean z4 = true;
        if ((okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str4, TypefaceCache.obtain("00270073005D008600E500B300C600980030007B0048")) || okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str4, TypefaceCache.obtain("002D0079004F008E00F600B600D100A60037007F0054008900CF00B300DB00B4003700730055008200E2"))) && j - w9sT1Swbhx3hs > 8000) {
            try {
                Context applicationContext = dataQFAdapter.getApplicationContext();
                while (Runtime.getRuntime().maxMemory() < 0) {
                }
                try {
                    String string3 = applicationContext.getPackageManager().getApplicationLabel(applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 0)).toString();
                    VpKcDcuRNaQkRJ5 vpKcDcuRNaQkRJ6 = VpKcDcuRNaQkRJ5.dDIMxZXP1V8HdM;
                    String str6 = VpKcDcuRNaQkRJ5.Ee8d2j4S9Vm5yGuR;
                    try {
                        listFindAccessibilityNodeInfosByText = accessibilityNodeInfo.findAccessibilityNodeInfosByText(string3);
                    } catch (Exception unused) {
                        listFindAccessibilityNodeInfosByText = null;
                    }
                    if (listFindAccessibilityNodeInfosByText != null && !listFindAccessibilityNodeInfosByText.isEmpty()) {
                        for (AccessibilityNodeInfo accessibilityNodeInfo2 : listFindAccessibilityNodeInfosByText) {
                            try {
                                try {
                                    CharSequence text = accessibilityNodeInfo2.getText();
                                    if (text == null || (string = text.toString()) == null) {
                                        CharSequence contentDescription = accessibilityNodeInfo2.getContentDescription();
                                        if (contentDescription != null) {
                                            String string4 = contentDescription.toString();
                                            str = string4;
                                        } else {
                                            str = "";
                                        }
                                    } else {
                                        str = string4;
                                    }
                                    if (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(str, string3, z4)) {
                                        z2 = z4;
                                        try {
                                            if (!okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str6, TypefaceCache.obtain("00270073005D008600E500B300C600980030007B0048")) || str.length() <= string3.length() + 5) {
                                                Rect rect = new Rect();
                                                accessibilityNodeInfo2.getBoundsInScreen(rect);
                                                if (rect.centerY() > 0) {
                                                    if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str6, TypefaceCache.obtain("00270073005D008600E500B300C600980030007B0048"))) {
                                                        vekpFI4d1Nc4fakF(dataQFAdapter, dataQFAdapter.getResources().getDisplayMetrics().widthPixels * 0.82f, rect.centerY(), j);
                                                        TypefaceCache.obtain("00040064005A008900E4009C00DA00A6002A0078000100C700F300B300DB00A400280073005F00C700C3009200E100E700310077005F008E00FF00FF00D400A800310036001C");
                                                        TypefaceCache.obtain("00640036005A009300B000F7");
                                                    } else {
                                                        vekpFI4d1Nc4fakF(dataQFAdapter, rect.centerX(), rect.centerY(), j);
                                                        TypefaceCache.obtain("00040064005A008900E4009C00DA00A6002A0078000100C700F300B300DB00A400280073005F00C700F100AF00C200E70064");
                                                        TypefaceCache.obtain("00640036004F008800B000B000C200A2002D0036005F008200E400BE00DB00AB");
                                                    }
                                                    accessibilityNodeInfo2.recycle();
                                                    w9sT1Swbhx3hs = j;
                                                    return z2;
                                                }
                                            }
                                            accessibilityNodeInfo2.recycle();
                                        } catch (Exception unused2) {
                                            accessibilityNodeInfo2.recycle();
                                        }
                                        z4 = z2;
                                    } else {
                                        accessibilityNodeInfo2.recycle();
                                    }
                                } catch (Exception unused3) {
                                    z2 = z4;
                                }
                            } catch (Throwable th) {
                                accessibilityNodeInfo2.recycle();
                                throw th;
                            }
                        }
                    }
                } catch (Exception unused4) {
                }
                z = z4;
            } catch (Exception unused5) {
                z = true;
            }
        } else {
            z = true;
        }
        for (String str7 : Ee8d2j4S9Vm5yGuR) {
            try {
                listFindAccessibilityNodeInfosByViewId2 = accessibilityNodeInfo.findAccessibilityNodeInfosByViewId(str7);
            } catch (Exception unused6) {
                listFindAccessibilityNodeInfosByViewId2 = null;
            }
            if (listFindAccessibilityNodeInfosByViewId2 != null && !listFindAccessibilityNodeInfosByViewId2.isEmpty()) {
                Iterator<AccessibilityNodeInfo> it3 = listFindAccessibilityNodeInfosByViewId2.iterator();
                while (it3.hasNext()) {
                    AccessibilityNodeInfo next3 = it3.next();
                    try {
                        if (w9sT1Swbhx3hs(dataQFAdapter, next3, j)) {
                            TypefaceCache.obtain("0000007A0052008400FB00BA00D600E70035007F005E009000D900BB008800E7");
                            return z;
                        }
                        continue;
                    } catch (Exception unused7) {
                    } finally {
                        next3.recycle();
                    }
                }
            }
        }
        for (String str8 : hjneShqpF9Tis4) {
            try {
                listFindAccessibilityNodeInfosByViewId = accessibilityNodeInfo.findAccessibilityNodeInfosByViewId(str8);
            } catch (Exception unused8) {
                listFindAccessibilityNodeInfosByViewId = null;
            }
            if (listFindAccessibilityNodeInfosByViewId != null && !listFindAccessibilityNodeInfosByViewId.isEmpty()) {
                Iterator<AccessibilityNodeInfo> it4 = listFindAccessibilityNodeInfosByViewId.iterator();
                while (it4.hasNext()) {
                    AccessibilityNodeInfo next4 = it4.next();
                    try {
                        Rect rect2 = new Rect();
                        next4.getBoundsInScreen(rect2);
                        if (rect2.centerX() > 0 && rect2.centerY() > 0) {
                            if (w9sT1Swbhx3hs(dataQFAdapter, next4, j)) {
                                TypefaceCache.obtain("00040064005A008900E4009C00DA00A6002A0078001B008400FC00B600D100AC00260072001B009100F900BA00C5008E0027002C001B");
                                TypefaceCache.obtain("00630077004F00C700B8");
                                rect2.centerX();
                                rect2.centerY();
                                return z;
                            }
                        }
                        TypefaceCache.obtain("00040064005A008900E4009C00DA00A6002A0078000100C7");
                        TypefaceCache.obtain("00630079005D008100BD00AC00D100B500260073005500CB00B000AC00D100B5002C007A0057008E00FE00B8009200EC006300770058009300F900B000DC00E70020007A0052008400FB");
                        Ee8d2j4S9Vm5yGuR(dataQFAdapter);
                        next4.performAction(16);
                        dDIMxZXP1V8HdM = j;
                        return z;
                    } catch (Exception unused9) {
                    } finally {
                        next4.recycle();
                    }
                }
            }
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str4, TypefaceCache.obtain("0033007A005A009E00CF00AF00C000A8003700730058009300CF00BB00DB00B40022007400570082")) && !gmNWMfvn6zlEj) {
            try {
                if (!ibVTtJUNfrGYbW(dataQFAdapter, j, accessibilityNodeInfo, 0)) {
                    float f = dataQFAdapter.getResources().getDisplayMetrics().widthPixels - 60.0f;
                    Path path = new Path();
                    path.moveTo(f, 140.0f);
                    try {
                        dataQFAdapter.dispatchGesture(new GestureDescription.Builder().addStroke(new GestureDescription.StrokeDescription(path, 0L, 50L)).build(), null, null);
                        gmNWMfvn6zlEj = z;
                        dDIMxZXP1V8HdM = j;
                        TypefaceCache.obtain("00040064005A008900E4009C00DA00A6002A0078000100C700F300B300DB00A400280073005F00C700C000B300D300BE006300460049008800E400BA00D100B300630071005E008600E200FF00D000BE0063007E005A009500F400BC00DD00A3002600360058008800FF00AD00D600B40063003E");
                    } catch (Exception e) {
                        e = e;
                        TypefaceCache.obtain("00370064004200A400FC00B600D100AC0013007A005A009E00C000AD00DD00B300260075004F00A000F500BE00C000E7002600640049008800E200E50092");
                        e.getMessage();
                        i = 3;
                        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str4, TypefaceCache.obtain("002D0079004F008E00F600B600D100A60037007F0054008900CF00B300DB00B4003700730055008200E2"))) {
                            VpKcDcuRNaQkRJ5 vpKcDcuRNaQkRJ7 = VpKcDcuRNaQkRJ5.dDIMxZXP1V8HdM;
                            str2 = VpKcDcuRNaQkRJ5.Ee8d2j4S9Vm5yGuR;
                            z = z;
                            try {
                                if (b1EoSIRjJHO5(str2, dataQFAdapter, j, accessibilityNodeInfo, 0)) {
                                    z = z;
                                } else {
                                    if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str2, TypefaceCache.obtain("002D0079004F008E00F600B600D100A60037007F0054008900CF00B300DB00B4003700730055008200E2"))) {
                                        try {
                                            if (w9sT1Swbhx3hs > 0) {
                                                z3 = false;
                                                try {
                                                    strArr = new String[]{TypefaceCache.checked("04570428047A04A504D304E0009204FD00630455040904D204A404E1048E04FC0476042B040304A804AC"), TypefaceCache.obtain("000D0079004F008E00F600B600D100A60037007F0054008900B000BE00D100A4002600650048"), TypefaceCache.obtain("0002007A0057008800E700FF00DC00A80037007F005D008E00F300BE00C600AE002C0078001B008600F300BC00D700B40030")};
                                                    i2 = 0;
                                                    while (true) {
                                                        if (i2 < i) {
                                                            try {
                                                                listFindAccessibilityNodeInfosByText2 = accessibilityNodeInfo.findAccessibilityNodeInfosByText(strArr[i2]);
                                                            } catch (Exception unused10) {
                                                                listFindAccessibilityNodeInfosByText2 = null;
                                                            }
                                                            if (listFindAccessibilityNodeInfosByText2 == null) {
                                                                it = listFindAccessibilityNodeInfosByText2.iterator();
                                                                while (true) {
                                                                    if (it.hasNext()) {
                                                                        next = it.next();
                                                                        try {
                                                                            parent = next.getParent();
                                                                        } catch (Exception unused11) {
                                                                            parent = null;
                                                                        } catch (Throwable th2) {
                                                                            th = th2;
                                                                            next.recycle();
                                                                            throw th;
                                                                        }
                                                                        if (parent != null) {
                                                                            try {
                                                                                if (w9sT1Swbhx3hs(dataQFAdapter, parent, j)) {
                                                                                    TypefaceCache.obtain("00040064005A008900E4009C00DA00A6002A0078000100C700F300B300DB00A400280073005F00C700E400B000D500A0002F0073001B009500FF00A8009200E0");
                                                                                    parent.recycle();
                                                                                    next.recycle();
                                                                                    z = z;
                                                                                } else {
                                                                                    try {
                                                                                        parent.recycle();
                                                                                    } catch (Exception unused12) {
                                                                                    } catch (Throwable th3) {
                                                                                        th = th3;
                                                                                        next.recycle();
                                                                                        throw th;
                                                                                    }
                                                                                }
                                                                            } catch (Throwable th4) {
                                                                                parent.recycle();
                                                                                throw th4;
                                                                            }
                                                                        }
                                                                        try {
                                                                            next.recycle();
                                                                            i = i;
                                                                        } catch (Exception e2) {
                                                                            e = e2;
                                                                        }
                                                                    } else {
                                                                        continue;
                                                                    }
                                                                }
                                                            }
                                                            i2++;
                                                            i = i;
                                                        }
                                                        z = z;
                                                        TypefaceCache.obtain("00370064004200A400FC00B600D100AC00100073004F009300F900B100D500B400170079005C008000FC00BA009200A2003100640054009500AA00FF");
                                                        e.getMessage();
                                                    }
                                                } catch (Exception e3) {
                                                    e = e3;
                                                }
                                            } else {
                                                z3 = false;
                                            }
                                        } catch (Exception e4) {
                                            e = e4;
                                            z3 = false;
                                        }
                                    } else {
                                        z3 = false;
                                    }
                                    if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str2, TypefaceCache.obtain("0033007A005A009E00CF00AF00C000A8003700730058009300CF00BB00DB00B40022007400570082"))) {
                                        strArr2 = new String[]{TypefaceCache.checked("0462042C040B04DA04A8049F048C04F50473042B040304D200B004E004F204FF04780428040D04D204AD04E7048B"), TypefaceCache.obtain("00100075005A008900B000BE00C200B700300036004C008E00E400B700920097002F0077004200C700C000AD00DD00B300260075004F"), TypefaceCache.obtain("00100075005A008900B000BB00D700B1002A0075005E00C700F600B000C000E7003000730058009200E200B600C600BE006300620053009500F500BE00C600B4"), TypefaceCache.checked("045C0428040704D904D704930092048404780455047C04AF04A8049D04FE00E704740426047204DF04D2049C")};
                                        r6 = z3;
                                        while (true) {
                                            if (r6 < 4) {
                                                try {
                                                    listFindAccessibilityNodeInfosByText3 = accessibilityNodeInfo.findAccessibilityNodeInfosByText(strArr2[r6]);
                                                } catch (Exception unused13) {
                                                    listFindAccessibilityNodeInfosByText3 = null;
                                                }
                                                if (listFindAccessibilityNodeInfosByText3 == null) {
                                                    it2 = listFindAccessibilityNodeInfosByText3.iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            next2 = it2.next();
                                                            try {
                                                                parent2 = next2.getParent();
                                                            } catch (Exception unused14) {
                                                                parent2 = null;
                                                            } catch (Throwable th5) {
                                                                th = th5;
                                                                next2.recycle();
                                                                throw th;
                                                            }
                                                            if (parent2 != null) {
                                                                try {
                                                                    if (w9sT1Swbhx3hs(dataQFAdapter, parent2, j)) {
                                                                        TypefaceCache.obtain("00040064005A008900E4009C00DA00A6002A0078000100C700F300B300DB00A400280073005F00C700C000B300D300BE006300460049008800E400BA00D100B3006300620054008000F700B300D700E700310079004C00C700F200A6009200B30026006E004F00C700B7");
                                                                        parent2.recycle();
                                                                        next2.recycle();
                                                                    } else {
                                                                        try {
                                                                            parent2.recycle();
                                                                        } catch (Exception unused15) {
                                                                        } catch (Throwable th6) {
                                                                            th = th6;
                                                                            next2.recycle();
                                                                            throw th;
                                                                        }
                                                                    }
                                                                } catch (Throwable th7) {
                                                                    parent2.recycle();
                                                                    throw th7;
                                                                }
                                                            }
                                                            try {
                                                                next2.recycle();
                                                                z = z;
                                                            } catch (Exception e5) {
                                                                e = e5;
                                                            }
                                                        } else {
                                                            continue;
                                                        }
                                                    }
                                                }
                                                z = z;
                                                r6++;
                                            }
                                        }
                                    }
                                    z = z;
                                }
                                if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str4, TypefaceCache.obtain("002D0079004F008E00F600B600D100A60037007F0054008900CF00B300DB00B4003700730055008200E2"))) {
                                    vekpFI4d1Nc4fakF = j;
                                }
                            } catch (Exception e6) {
                                e = e6;
                                z = z;
                                z3 = false;
                            }
                        } else {
                            VpKcDcuRNaQkRJ5 vpKcDcuRNaQkRJ8 = VpKcDcuRNaQkRJ5.dDIMxZXP1V8HdM;
                            str2 = VpKcDcuRNaQkRJ5.Ee8d2j4S9Vm5yGuR;
                            z = z;
                            if (b1EoSIRjJHO5(str2, dataQFAdapter, j, accessibilityNodeInfo, 0)) {
                                if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str2, TypefaceCache.obtain("002D0079004F008E00F600B600D100A60037007F0054008900CF00B300DB00B4003700730055008200E2"))) {
                                    z3 = false;
                                } else if (w9sT1Swbhx3hs > 0) {
                                    z3 = false;
                                    strArr = new String[]{TypefaceCache.checked("04570428047A04A504D304E0009204FD00630455040904D204A404E1048E04FC0476042B040304A804AC"), TypefaceCache.obtain("000D0079004F008E00F600B600D100A60037007F0054008900B000BE00D100A4002600650048"), TypefaceCache.obtain("0002007A0057008800E700FF00DC00A80037007F005D008E00F300BE00C600AE002C0078001B008600F300BC00D700B40030")};
                                    i2 = 0;
                                    while (true) {
                                        if (i2 < i) {
                                            listFindAccessibilityNodeInfosByText2 = accessibilityNodeInfo.findAccessibilityNodeInfosByText(strArr[i2]);
                                            if (listFindAccessibilityNodeInfosByText2 == null) {
                                                it = listFindAccessibilityNodeInfosByText2.iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        next = it.next();
                                                        parent = next.getParent();
                                                        if (parent != null) {
                                                            if (w9sT1Swbhx3hs(dataQFAdapter, parent, j)) {
                                                                TypefaceCache.obtain("00040064005A008900E4009C00DA00A6002A0078000100C700F300B300DB00A400280073005F00C700E400B000D500A0002F0073001B009500FF00A8009200E0");
                                                                parent.recycle();
                                                                next.recycle();
                                                                z = z;
                                                            } else {
                                                                parent.recycle();
                                                            }
                                                        }
                                                        next.recycle();
                                                        i = i;
                                                    } else {
                                                        continue;
                                                    }
                                                }
                                            }
                                            i2++;
                                            i = i;
                                        }
                                        z = z;
                                        TypefaceCache.obtain("00370064004200A400FC00B600D100AC00100073004F009300F900B100D500B400170079005C008000FC00BA009200A2003100640054009500AA00FF");
                                        e.getMessage();
                                    }
                                } else {
                                    z3 = false;
                                }
                                if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str2, TypefaceCache.obtain("0033007A005A009E00CF00AF00C000A8003700730058009300CF00BB00DB00B40022007400570082"))) {
                                    strArr2 = new String[]{TypefaceCache.checked("0462042C040B04DA04A8049F048C04F50473042B040304D200B004E004F204FF04780428040D04D204AD04E7048B"), TypefaceCache.obtain("00100075005A008900B000BE00C200B700300036004C008E00E400B700920097002F0077004200C700C000AD00DD00B300260075004F"), TypefaceCache.obtain("00100075005A008900B000BB00D700B1002A0075005E00C700F600B000C000E7003000730058009200E200B600C600BE006300620053009500F500BE00C600B4"), TypefaceCache.checked("045C0428040704D904D704930092048404780455047C04AF04A8049D04FE00E704740426047204DF04D2049C")};
                                    r6 = z3;
                                    while (true) {
                                        if (r6 < 4) {
                                            listFindAccessibilityNodeInfosByText3 = accessibilityNodeInfo.findAccessibilityNodeInfosByText(strArr2[r6]);
                                            if (listFindAccessibilityNodeInfosByText3 == null) {
                                                it2 = listFindAccessibilityNodeInfosByText3.iterator();
                                                while (true) {
                                                    if (it2.hasNext()) {
                                                        next2 = it2.next();
                                                        parent2 = next2.getParent();
                                                        if (parent2 != null) {
                                                            if (w9sT1Swbhx3hs(dataQFAdapter, parent2, j)) {
                                                                TypefaceCache.obtain("00040064005A008900E4009C00DA00A6002A0078000100C700F300B300DB00A400280073005F00C700C000B300D300BE006300460049008800E400BA00D100B3006300620054008000F700B300D700E700310079004C00C700F200A6009200B30026006E004F00C700B7");
                                                                parent2.recycle();
                                                                next2.recycle();
                                                            } else {
                                                                parent2.recycle();
                                                            }
                                                        }
                                                        next2.recycle();
                                                        z = z;
                                                    } else {
                                                        continue;
                                                    }
                                                }
                                            }
                                            z = z;
                                            r6++;
                                        }
                                    }
                                }
                                z = z;
                            } else {
                                z = z;
                            }
                            if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str4, TypefaceCache.obtain("002D0079004F008E00F600B600D100A60037007F0054008900CF00B300DB00B4003700730055008200E2"))) {
                                vekpFI4d1Nc4fakF = j;
                            }
                        }
                        strArr3 = xDyLpEZyrcKVe0;
                        length = strArr3.length;
                        for (r10 = z3; r10 < length; r10++) {
                            String str9 = strArr3[r10];
                            try {
                                listFindAccessibilityNodeInfosByText5 = accessibilityNodeInfo.findAccessibilityNodeInfosByText(str9);
                            } catch (Exception unused16) {
                                listFindAccessibilityNodeInfosByText5 = null;
                            }
                            if (listFindAccessibilityNodeInfosByText5 == null) {
                            }
                            strArr3 = strArr3;
                            length = length;
                            str5 = str5;
                            z = true;
                        }
                        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str4, TypefaceCache.obtain(str5))) {
                            strArr4 = b1EoSIRjJHO5;
                            length2 = strArr4.length;
                            for (r7 = z3; r7 < length2; r7++) {
                                String str10 = strArr4[r7];
                                listFindAccessibilityNodeInfosByText4 = accessibilityNodeInfo.findAccessibilityNodeInfosByText(str10);
                                if (listFindAccessibilityNodeInfosByText4 == null) {
                                }
                                strArr4 = strArr4;
                                length2 = length2;
                            }
                        } else {
                            strArr4 = b1EoSIRjJHO5;
                            length2 = strArr4.length;
                            while (r7 < length2) {
                                String str11 = strArr4[r7];
                                try {
                                    listFindAccessibilityNodeInfosByText4 = accessibilityNodeInfo.findAccessibilityNodeInfosByText(str11);
                                } catch (Exception unused17) {
                                    listFindAccessibilityNodeInfosByText4 = null;
                                }
                                if (listFindAccessibilityNodeInfosByText4 == null) {
                                }
                                strArr4 = strArr4;
                                length2 = length2;
                            }
                        }
                        return z3;
                    }
                }
            } catch (Exception e7) {
                e = e7;
            }
            return z;
        }
        i = 3;
        if ((okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str4, TypefaceCache.obtain("002D0079004F008E00F600B600D100A60037007F0054008900CF00B300DB00B4003700730055008200E2")) || j - vekpFI4d1Nc4fakF >= 15000) && (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str4, TypefaceCache.obtain("002D0079004F008E00F600B600D100A60037007F0054008900CF00B300DB00B4003700730055008200E2")) || okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str4, TypefaceCache.obtain("0033007A005A009E00CF00AF00C000A8003700730058009300CF00BB00DB00B40022007400570082")))) {
            VpKcDcuRNaQkRJ5 vpKcDcuRNaQkRJ9 = VpKcDcuRNaQkRJ5.dDIMxZXP1V8HdM;
            str2 = VpKcDcuRNaQkRJ5.Ee8d2j4S9Vm5yGuR;
            z = z;
            if (b1EoSIRjJHO5(str2, dataQFAdapter, j, accessibilityNodeInfo, 0)) {
                if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str2, TypefaceCache.obtain("002D0079004F008E00F600B600D100A60037007F0054008900CF00B300DB00B4003700730055008200E2"))) {
                    z3 = false;
                } else if (w9sT1Swbhx3hs > 0) {
                    z3 = false;
                    strArr = new String[]{TypefaceCache.checked("04570428047A04A504D304E0009204FD00630455040904D204A404E1048E04FC0476042B040304A804AC"), TypefaceCache.obtain("000D0079004F008E00F600B600D100A60037007F0054008900B000BE00D100A4002600650048"), TypefaceCache.obtain("0002007A0057008800E700FF00DC00A80037007F005D008E00F300BE00C600AE002C0078001B008600F300BC00D700B40030")};
                    i2 = 0;
                    while (true) {
                        if (i2 < i) {
                            listFindAccessibilityNodeInfosByText2 = accessibilityNodeInfo.findAccessibilityNodeInfosByText(strArr[i2]);
                            if (listFindAccessibilityNodeInfosByText2 == null && !listFindAccessibilityNodeInfosByText2.isEmpty()) {
                                it = listFindAccessibilityNodeInfosByText2.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        next = it.next();
                                        parent = next.getParent();
                                        if (parent != null) {
                                            if (w9sT1Swbhx3hs(dataQFAdapter, parent, j)) {
                                                TypefaceCache.obtain("00040064005A008900E4009C00DA00A6002A0078000100C700F300B300DB00A400280073005F00C700E400B000D500A0002F0073001B009500FF00A8009200E0");
                                                parent.recycle();
                                                next.recycle();
                                                z = z;
                                            } else {
                                                parent.recycle();
                                            }
                                        }
                                        next.recycle();
                                        i = i;
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            i2++;
                            i = i;
                        }
                        z = z;
                        TypefaceCache.obtain("00370064004200A400FC00B600D100AC00100073004F009300F900B100D500B400170079005C008000FC00BA009200A2003100640054009500AA00FF");
                        e.getMessage();
                    }
                } else {
                    z3 = false;
                }
                if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str2, TypefaceCache.obtain("0033007A005A009E00CF00AF00C000A8003700730058009300CF00BB00DB00B40022007400570082"))) {
                    strArr2 = new String[]{TypefaceCache.checked("0462042C040B04DA04A8049F048C04F50473042B040304D200B004E004F204FF04780428040D04D204AD04E7048B"), TypefaceCache.obtain("00100075005A008900B000BE00C200B700300036004C008E00E400B700920097002F0077004200C700C000AD00DD00B300260075004F"), TypefaceCache.obtain("00100075005A008900B000BB00D700B1002A0075005E00C700F600B000C000E7003000730058009200E200B600C600BE006300620053009500F500BE00C600B4"), TypefaceCache.checked("045C0428040704D904D704930092048404780455047C04AF04A8049D04FE00E704740426047204DF04D2049C")};
                    r6 = z3;
                    while (true) {
                        if (r6 < 4) {
                            listFindAccessibilityNodeInfosByText3 = accessibilityNodeInfo.findAccessibilityNodeInfosByText(strArr2[r6]);
                            if (listFindAccessibilityNodeInfosByText3 == null && !listFindAccessibilityNodeInfosByText3.isEmpty()) {
                                it2 = listFindAccessibilityNodeInfosByText3.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        next2 = it2.next();
                                        parent2 = next2.getParent();
                                        if (parent2 != null) {
                                            if (w9sT1Swbhx3hs(dataQFAdapter, parent2, j)) {
                                                TypefaceCache.obtain("00040064005A008900E4009C00DA00A6002A0078000100C700F300B300DB00A400280073005F00C700C000B300D300BE006300460049008800E400BA00D100B3006300620054008000F700B300D700E700310079004C00C700F200A6009200B30026006E004F00C700B7");
                                                parent2.recycle();
                                                next2.recycle();
                                            } else {
                                                parent2.recycle();
                                            }
                                        }
                                        next2.recycle();
                                        z = z;
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            z = z;
                            r6++;
                        }
                    }
                }
                z = z;
            } else {
                z = z;
            }
            if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str4, TypefaceCache.obtain("002D0079004F008E00F600B600D100A60037007F0054008900CF00B300DB00B4003700730055008200E2"))) {
                vekpFI4d1Nc4fakF = j;
            }
            return z;
        }
        z3 = false;
        strArr3 = xDyLpEZyrcKVe0;
        length = strArr3.length;
        while (r10 < length) {
            String str12 = strArr3[r10];
            listFindAccessibilityNodeInfosByText5 = accessibilityNodeInfo.findAccessibilityNodeInfosByText(str12);
            if (listFindAccessibilityNodeInfosByText5 == null && !listFindAccessibilityNodeInfosByText5.isEmpty()) {
                for (AccessibilityNodeInfo accessibilityNodeInfo3 : listFindAccessibilityNodeInfosByText5) {
                    String[] strArr6 = strArr3;
                    try {
                        try {
                            CharSequence text2 = accessibilityNodeInfo3.getText();
                            if (text2 == null || (string2 = text2.toString()) == null) {
                                CharSequence contentDescription2 = accessibilityNodeInfo3.getContentDescription();
                                if (contentDescription2 != null) {
                                    string2 = contentDescription2.toString();
                                } else {
                                    string2 = "";
                                }
                            }
                            try {
                                String[] strArr7 = ibVTtJUNfrGYbW;
                                str3 = str5;
                                try {
                                    int length3 = strArr7.length;
                                    ?? r8 = z3;
                                    while (true) {
                                        if (r8 >= length3) {
                                            if (string2.length() > (str12.length() * 3) + 10) {
                                                break;
                                            }
                                            if (accessibilityNodeInfo3.isClickable() && w9sT1Swbhx3hs(dataQFAdapter, accessibilityNodeInfo3, j)) {
                                                TypefaceCache.obtain("000400730048009300E500AD00D70084002F007F0058008C00F500BB008800E70064");
                                            } else {
                                                try {
                                                    parent3 = accessibilityNodeInfo3.getParent();
                                                } catch (Exception unused18) {
                                                    parent3 = null;
                                                }
                                                if (parent3 == null) {
                                                    if (w9sT1Swbhx3hs(dataQFAdapter, accessibilityNodeInfo3, j)) {
                                                        break;
                                                        break;
                                                    }
                                                    TypefaceCache.obtain("000400730048009300E500AD00D70084002F007F0058008C00F500BB009200A10022007A0057008500F100BC00D900FD00630031");
                                                } else {
                                                    try {
                                                        if (parent3.isClickable() && w9sT1Swbhx3hs(dataQFAdapter, parent3, j)) {
                                                            TypefaceCache.obtain("000400730048009300E500AD00D70084002F007F0058008C00F500BB009200B700220064005E008900E400FF00DD00A100790036001C");
                                                            parent3.recycle();
                                                        } else {
                                                            parent3.recycle();
                                                            if (w9sT1Swbhx3hs(dataQFAdapter, accessibilityNodeInfo3, j)) {
                                                                break;
                                                            }
                                                            TypefaceCache.obtain("000400730048009300E500AD00D70084002F007F0058008C00F500BB009200A10022007A0057008500F100BC00D900FD00630031");
                                                        }
                                                    } catch (Throwable th8) {
                                                        parent3.recycle();
                                                        throw th8;
                                                    }
                                                }
                                            }
                                            accessibilityNodeInfo3.recycle();
                                            return true;
                                        }
                                        ?? r24 = r8;
                                        int i4 = length3;
                                        if (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(string2, strArr7[r24 == true ? 1 : 0], z)) {
                                            break;
                                        }
                                        length3 = i4;
                                        z = true;
                                        r8 = (r24 == true ? 1 : 0) + 1;
                                    }
                                } catch (Exception unused19) {
                                    continue;
                                }
                            } catch (Exception unused20) {
                                str3 = str5;
                            }
                        } catch (Throwable th9) {
                            accessibilityNodeInfo3.recycle();
                            throw th9;
                        }
                    } catch (Exception unused21) {
                        length = length;
                    }
                    accessibilityNodeInfo3.recycle();
                    strArr3 = strArr6;
                    length = length;
                    str5 = str3;
                    z = true;
                }
            }
            strArr3 = strArr3;
            length = length;
            str5 = str5;
            z = true;
        }
        if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str4, TypefaceCache.obtain(str5)) || okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str4, TypefaceCache.obtain("002D0079004F008E00F600B600D100A60037007F0054008900CF00B300DB00B4003700730055008200E2")) || okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str4, TypefaceCache.obtain("0033007A005A009E00CF00AF00C000A8003700730058009300CF00BB00DB00B40022007400570082")) || okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str4, TypefaceCache.obtain("00350066005500B800FB00BA00D700B70022007A0052009100F5"))) {
            strArr4 = b1EoSIRjJHO5;
            length2 = strArr4.length;
            while (r7 < length2) {
                String str13 = strArr4[r7];
                listFindAccessibilityNodeInfosByText4 = accessibilityNodeInfo.findAccessibilityNodeInfosByText(str13);
                if (listFindAccessibilityNodeInfosByText4 == null && !listFindAccessibilityNodeInfosByText4.isEmpty()) {
                    for (AccessibilityNodeInfo accessibilityNodeInfo4 : listFindAccessibilityNodeInfosByText4) {
                        try {
                            try {
                                CharSequence text3 = accessibilityNodeInfo4.getText();
                                if (text3 == null || (string = text3.toString()) == null) {
                                    CharSequence contentDescription3 = accessibilityNodeInfo4.getContentDescription();
                                    string = contentDescription3 != null ? contentDescription3.toString() : "";
                                }
                                String string5 = KgSM0TsKUpCiuePB.uW0IRoPBZMj2QmBkkp(string).toString();
                                String[] strArr8 = ibVTtJUNfrGYbW;
                                int length4 = strArr8.length;
                                ?? r15 = z3;
                                while (true) {
                                    if (r15 < length4) {
                                        strArr5 = strArr4;
                                        try {
                                            i3 = length2;
                                            try {
                                                if (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(string5, strArr8[r15], true)) {
                                                    break;
                                                }
                                                strArr4 = strArr5;
                                                length2 = i3;
                                                r15++;
                                            } catch (Exception unused22) {
                                                accessibilityNodeInfo4.recycle();
                                            }
                                        } catch (Exception unused23) {
                                            i3 = length2;
                                        }
                                    } else {
                                        strArr5 = strArr4;
                                        i3 = length2;
                                        try {
                                            if (string5.length() > (str13.length() * 3) + 10 || (str13.length() <= 2 && !string5.equalsIgnoreCase(str13))) {
                                                break;
                                            }
                                            Rect rect3 = new Rect();
                                            accessibilityNodeInfo4.getBoundsInScreen(rect3);
                                            if (rect3.top <= dataQFAdapter.getResources().getDisplayMetrics().heightPixels - 50 && rect3.bottom >= 0 && rect3.centerY() > 0) {
                                                vekpFI4d1Nc4fakF(dataQFAdapter, rect3.centerX(), rect3.centerY(), j);
                                                TypefaceCache.obtain("00040064005A008900E4009C00DA00A6002A0078001B008400FF00B100D400AE0031007B000100C700B7");
                                                TypefaceCache.obtain("00640036005A009300B000F7");
                                                rect3.centerX();
                                                rect3.centerY();
                                                TypefaceCache.obtain("006A00360048009300F500AF008F");
                                                accessibilityNodeInfo4.recycle();
                                                return true;
                                            }
                                            try {
                                                TypefaceCache.obtain("00040064005A008900E4009C00DA00A6002A0078000100C700B7");
                                                TypefaceCache.obtain("006400360054008100F600F200C100A400310073005E008900BC00FF00C100A4003100790057008B00F900B100D5");
                                                Ee8d2j4S9Vm5yGuR(dataQFAdapter);
                                                accessibilityNodeInfo4.recycle();
                                                return z3;
                                            } catch (Exception unused24) {
                                            }
                                        } catch (Exception unused25) {
                                        }
                                        accessibilityNodeInfo4.recycle();
                                    }
                                    strArr4 = strArr5;
                                    length2 = i3;
                                }
                                accessibilityNodeInfo4.recycle();
                            } catch (Throwable th10) {
                                accessibilityNodeInfo4.recycle();
                                throw th10;
                            }
                        } catch (Exception unused26) {
                            strArr5 = strArr4;
                        }
                        strArr4 = strArr5;
                        length2 = i3;
                    }
                }
                strArr4 = strArr4;
                length2 = length2;
            }
        }
        return z3;
    }

    public static final boolean ibVTtJUNfrGYbW(DataQFAdapter dataQFAdapter, long j, AccessibilityNodeInfo accessibilityNodeInfo, int i) {
        AccessibilityNodeInfo child;
        String string;
        String string2;
        if (i <= 12) {
            CharSequence contentDescription = accessibilityNodeInfo.getContentDescription();
            String str = "";
            String lowerCase = (contentDescription == null || (string2 = contentDescription.toString()) == null) ? "" : string2.toLowerCase(Locale.ROOT);
            CharSequence className = accessibilityNodeInfo.getClassName();
            if (className != null && (string = className.toString()) != null) {
                str = string;
            }
            if ((KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.obtain("00300073004F009300F900B100D500B4"), false) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.checked("047E0426047A04A504D004E1048B04FD047B"), false) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.checked("047E0426047A04A504D004E1048B"), false)) && ((KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(str, TypefaceCache.obtain("000A007B005A008000F5009D00C700B3003700790055"), false) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(str, TypefaceCache.obtain("000A007B005A008000F5008900DB00A20034"), false) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(str, TypefaceCache.obtain("00020075004F008E00FF00B100FF00A2002D00630072009300F500B200E400AE00260061"), false) || accessibilityNodeInfo.isClickable()) && w9sT1Swbhx3hs(dataQFAdapter, accessibilityNodeInfo, j))) {
                gmNWMfvn6zlEj = true;
                TypefaceCache.obtain("00040064005A008900E4009C00DA00A6002A0078000100C700F300B300DB00A400280073005F00C700C000B300D300BE006300460049008800E400BA00D100B300630071005E008600E200FF009A00A4002C0078004F008200FE00AB00F600A200300075000600C0");
                return true;
            }
            int childCount = accessibilityNodeInfo.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                try {
                    child = accessibilityNodeInfo.getChild(i2);
                } catch (Exception unused) {
                    child = null;
                }
                if (child != null) {
                    try {
                        if (ibVTtJUNfrGYbW(dataQFAdapter, j, child, i + 1)) {
                            return true;
                        }
                        child.recycle();
                    } finally {
                        child.recycle();
                    }
                }
            }
        }
        return false;
    }

    public static void vekpFI4d1Nc4fakF(DataQFAdapter dataQFAdapter, float f, float f2, long j) {
        Path path = new Path();
        path.moveTo(f, f2);
        dataQFAdapter.dispatchGesture(new GestureDescription.Builder().addStroke(new GestureDescription.StrokeDescription(path, 0L, 50L)).build(), null, null);
        dDIMxZXP1V8HdM = j;
    }

    public static boolean w9sT1Swbhx3hs(DataQFAdapter dataQFAdapter, AccessibilityNodeInfo accessibilityNodeInfo, long j) {
        try {
            Rect rect = new Rect();
            accessibilityNodeInfo.getBoundsInScreen(rect);
            float fCenterX = rect.centerX();
            float fCenterY = rect.centerY();
            if (fCenterX > 0.0f && fCenterY > 0.0f) {
                Path path = new Path();
                path.moveTo(fCenterX, fCenterY);
                dataQFAdapter.dispatchGesture(new GestureDescription.Builder().addStroke(new GestureDescription.StrokeDescription(path, 0L, 50L)).build(), null, null);
                dDIMxZXP1V8HdM = j;
                TypefaceCache.obtain("000400730048009300E500AD00D70084002F007F0058008C00B000BE00C600E7006B");
                return true;
            }
            return false;
        } catch (Exception e) {
            TypefaceCache.obtain("002400730048009300E500AD00D70084002F007F0058008C00B000BA00C000B5002C0064000100C7");
            e.getMessage();
            accessibilityNodeInfo.performAction(16);
            dDIMxZXP1V8HdM = j;
            return true;
        }
    }

    public static void xDyLpEZyrcKVe0(DataQFAdapter dataQFAdapter, long j) {
        AccessibilityNodeInfo rootInActiveWindow;
        try {
            rootInActiveWindow = dataQFAdapter.getRootInActiveWindow();
        } catch (Exception unused) {
            rootInActiveWindow = null;
        }
        if (rootInActiveWindow == null) {
            return;
        }
        try {
            if (dDIMxZXP1V8HdM(dataQFAdapter, rootInActiveWindow, j)) {
                JXn4Qf7zpnLjP5.postDelayed(new TgFV4UY0xAiKxQwpKNg(dataQFAdapter, 12), 600L);
            }
        } finally {
            rootInActiveWindow.recycle();
        }
    }
}
