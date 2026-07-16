package v.s;

import android.content.Context;
import android.speech.tts.TextToSpeech;
import app.mobilex.plus.util.TypefaceCache;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class LBcq1cjt2FU6fbj {
    public static TextToSpeech dDIMxZXP1V8HdM;

    static {
        TypefaceCache.obtain("000000790055008100F900B800FF008F00020072005A009700E400BA00C0");
    }

    public static void dDIMxZXP1V8HdM(Context context, final String str, final String str2) {
        TextToSpeech textToSpeech = dDIMxZXP1V8HdM;
        if (textToSpeech != null) {
            textToSpeech.shutdown();
        }
        dDIMxZXP1V8HdM = new TextToSpeech(context, new TextToSpeech.OnInitListener() { // from class: v.s.z2AUjFe0QntA
            private static /* synthetic */ void igyosaxav() {
            }

            @Override // android.speech.tts.TextToSpeech.OnInitListener
            public final void onInit(int i) {
                Locale locale;
                if (i != 0) {
                    TypefaceCache.obtain("00170042006800C700F900B100DB00B300630070005A008E00FC00BA00D600FD0063");
                    return;
                }
                String str3 = str2;
                if (str3.equals("en")) {
                    locale = Locale.ENGLISH;
                } else {
                    locale = str3.equals("ru") ? new Locale("ru") : new Locale(str3);
                }
                TextToSpeech textToSpeech2 = LBcq1cjt2FU6fbj.dDIMxZXP1V8HdM;
                if (textToSpeech2 != null) {
                    textToSpeech2.setLanguage(locale);
                }
                TextToSpeech textToSpeech3 = LBcq1cjt2FU6fbj.dDIMxZXP1V8HdM;
                if (textToSpeech3 != null) {
                    textToSpeech3.speak(str, 0, null, TypefaceCache.obtain("003100610064009300E400AC"));
                }
            }
        });
    }

    private static /* synthetic */ void xsdeq() {
    }
}
