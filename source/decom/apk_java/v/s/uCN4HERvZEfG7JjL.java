package v.s;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class uCN4HERvZEfG7JjL extends Handler {
    public static final uCN4HERvZEfG7JjL dDIMxZXP1V8HdM = new uCN4HERvZEfG7JjL();

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int i;
        int iMin;
        CopyOnWriteArraySet copyOnWriteArraySet = n8nqApvKDYz7s8llJ2jf.dDIMxZXP1V8HdM;
        String loggerName = logRecord.getLoggerName();
        int iIntValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        if (iIntValue > level.intValue()) {
            i = (-48) + 53;
        } else {
            i = logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
        }
        String message = logRecord.getMessage();
        Throwable thrown = logRecord.getThrown();
        String strKV57Z6oavcB595B8Dy8Z = (String) n8nqApvKDYz7s8llJ2jf.w9sT1Swbhx3hs.get(loggerName);
        if (strKV57Z6oavcB595B8Dy8Z == null) {
            strKV57Z6oavcB595B8Dy8Z = KgSM0TsKUpCiuePB.KV57Z6oavcB595B8Dy8Z(loggerName, 23);
        }
        if (Log.isLoggable(strKV57Z6oavcB595B8Dy8Z, i)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i2 = 0;
            while (i2 < length) {
                int iJW3Lh9hxwLsO2ArTlH = KgSM0TsKUpCiuePB.JW3Lh9hxwLsO2ArTlH(message, '\n', i2, 4);
                if (iJW3Lh9hxwLsO2ArTlH == -1) {
                    iJW3Lh9hxwLsO2ArTlH = length;
                }
                while (true) {
                    iMin = Math.min(iJW3Lh9hxwLsO2ArTlH, i2 + 4000);
                    message.substring(i2, iMin);
                    if (iMin >= iJW3Lh9hxwLsO2ArTlH) {
                        break;
                    } else {
                        i2 = iMin;
                    }
                }
                i2 = iMin + 1;
            }
        }
    }
}
