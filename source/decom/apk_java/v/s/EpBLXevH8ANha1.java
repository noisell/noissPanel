package v.s;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import app.mobilex.plus.util.TypefaceCache;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class EpBLXevH8ANha1 {
    public static final List Ee8d2j4S9Vm5yGuR;
    public static final List JXn4Qf7zpnLjP5;
    public static final Object dDIMxZXP1V8HdM;
    public static final Object vekpFI4d1Nc4fakF;
    public static final Object w9sT1Swbhx3hs;
    public static final List xDyLpEZyrcKVe0;

    static {
        TypefaceCache.obtain("001600620052008B00C2008B00E500A80031007D005E0095");
        dDIMxZXP1V8HdM = oRoeOWAwLibMBxZYyTh.l1V0lQr6TbwNKqHfXNbb(new yI1KTRoNlsjx(TypefaceCache.checked("04020427040E04A7"), TypefaceCache.checked("1F7A10036041A04D604A5049F048304F7047E042C")), new yI1KTRoNlsjx(TypefaceCache.obtain("00300074005E0095"), TypefaceCache.checked("1F7A10036041A04D604A5049F048304F7047E042C")), new yI1KTRoNlsjx("900", TypefaceCache.checked("1F7A10036041A04D604A5049F048304F7047E042C")), new yI1KTRoNlsjx(TypefaceCache.obtain("0037007F0055008C00FF00B900D4"), TypefaceCache.checked("1F7A20036041900CA048104EF048F04FD")), new yI1KTRoNlsjx(TypefaceCache.checked("0401042E040604AB04AA04E104F60483"), TypefaceCache.checked("1F7A20036041900CA048104EF048F04FD")), new yI1KTRoNlsjx(TypefaceCache.obtain("0037003B0059008600FE00B4"), TypefaceCache.checked("1F7A20036041900CA048104EF048F04FD")), new yI1KTRoNlsjx(TypefaceCache.checked("0473042D047704A304A0"), TypefaceCache.checked("1F5770036042B04DC04DC049B048200EA04520426040604DD")), new yI1KTRoNlsjx(TypefaceCache.obtain("0022007A005D0086"), TypefaceCache.checked("1F5770036042B04DC04DC049B048200EA04520426040604DD")), new yI1KTRoNlsjx(TypefaceCache.obtain("0022007A005D008600F200BE00DC00AC"), TypefaceCache.checked("1F5770036042B04DC04DC049B048200EA04520426040604DD")), new yI1KTRoNlsjx(TypefaceCache.checked("04710454040A"), TypefaceCache.checked("1F5760036042904C50481")), new yI1KTRoNlsjx(TypefaceCache.obtain("003500620059"), TypefaceCache.checked("1F5760036042904C50481")), new yI1KTRoNlsjx(TypefaceCache.checked("04700426040C04D804D004E1048E"), TypefaceCache.checked("1F5760036042804D704A704E004F204F9047F0427040B04DA04AA")), new yI1KTRoNlsjx(TypefaceCache.obtain("002400770041009700E200B000DF"), TypefaceCache.checked("1F5760036042804D704A704E004F204F9047F0427040B04DA04AA")), new yI1KTRoNlsjx(TypefaceCache.checked("04030426040204A3"), TypefaceCache.checked("1F7A20036041B04D704A9049B04F604F7047A0421040E04DA")), new yI1KTRoNlsjx(TypefaceCache.obtain("0031007700520081"), TypefaceCache.checked("1F7A20036041B04D704A9049B04F604F7047A0421040E04DA")), new yI1KTRoNlsjx(TypefaceCache.checked("047D0454040104A704DB049D048A04F2"), TypefaceCache.checked("1F7A30036042504A504AA049F04F90485047B0423")), new yI1KTRoNlsjx(TypefaceCache.obtain("002C00620050009500F900AB00DB00A2"), TypefaceCache.checked("1F7A30036042504A504AA049F04F90485047B0423")), new yI1KTRoNlsjx(TypefaceCache.checked("04030428047A04D604A004E20488"), TypefaceCache.checked("1F5770036041B04D904D104EE048204FA0479")), new yI1KTRoNlsjx(TypefaceCache.obtain("003100790048008500F100B100D9"), TypefaceCache.checked("1F5770036041B04D904D104EE048204FA0479")), new yI1KTRoNlsjx(TypefaceCache.checked("047C0457040A"), TypefaceCache.checked("1F7A30036042404C60481")), new yI1KTRoNlsjx(TypefaceCache.obtain("003300650059008600FE00B4"), TypefaceCache.checked("1F7A30036042404C60481")), new yI1KTRoNlsjx(TypefaceCache.checked("047F0454047A00C704A104EF048F04FD"), TypefaceCache.checked("1F5770036042704C504B100FF04A304F7047E042C")), new yI1KTRoNlsjx(TypefaceCache.obtain("002E00620048008500F100B100D9"), TypefaceCache.checked("1F5770036042704C504B100FF04A304F7047E042C")), new yI1KTRoNlsjx(TypefaceCache.checked("047C0428047C04A504A000FF048304F7047E042C"), TypefaceCache.checked("1F5760036042404D904D7049D048200E704520426040604DD")), new yI1KTRoNlsjx(TypefaceCache.obtain("003300790058008F00E400BE00D000A6002D007D"), TypefaceCache.checked("1F5760036042404D904D7049D048200E704520426040604DD")), new yI1KTRoNlsjx(TypefaceCache.checked("04060428047804DB"), TypefaceCache.checked("1F5770036041E04D904D304E3009204DD04030423040F04DF04D2")), new yI1KTRoNlsjx(TypefaceCache.obtain("002B00790056008200F300AD00D700A3002A0062"), TypefaceCache.checked("1F5770036041E04D904D304E3009204DD04030423040F04DF04D2")), new yI1KTRoNlsjx(TypefaceCache.checked("04030423040604D204D1049E048204FA0402"), TypefaceCache.checked("1F7A00036041B04D204AD04EA04F304860473042B047A")), new yI1KTRoNlsjx(TypefaceCache.obtain("003100730055008500F100B100D9"), TypefaceCache.checked("1F7A00036041B04D204AD04EA04F304860473042B047A")), new yI1KTRoNlsjx(TypefaceCache.checked("04020428040904DD04AE04E3"), TypefaceCache.checked("1F5770036041A04D904A204E5048C04FB04720426040604DD")), new yI1KTRoNlsjx(TypefaceCache.obtain("00300079004D008400FF00B2"), TypefaceCache.checked("1F5770036041A04D904A204E5048C04FB04720426040604DD")), new yI1KTRoNlsjx(TypefaceCache.checked("04060426040004D504A0"), TypefaceCache.checked("1F7A00036041E04D704AB04ED0482")), new yI1KTRoNlsjx(TypefaceCache.obtain("002B00770057009100F1"), TypefaceCache.checked("1F7A00036041E04D704AB04ED0482")), new yI1KTRoNlsjx(TypefaceCache.checked("047D0421040504DA00B004EE048204FA0479"), TypefaceCache.checked("1F5760036042504D004AE04E2009204D60473042B0401")), new yI1KTRoNlsjx(TypefaceCache.obtain("002C006C0054008900B000BD00D300A90028"), TypefaceCache.checked("1F5760036042504D004AE04E2009204D60473042B0401")), new yI1KTRoNlsjx(TypefaceCache.checked("040C042B040F04D204AA049E009204F60473042B0401"), TypefaceCache.checked("1F5770036041404DA04A404EA0488048600630407040B04DA04AA")), new yI1KTRoNlsjx(TypefaceCache.obtain("003A00770055008300F500A7009200A5002200780050"), TypefaceCache.checked("1F5770036041404DA04A404EA0488048600630407040B04DA04AA")), new yI1KTRoNlsjx(TypefaceCache.checked("040D007B0054008900F500A6"), TypefaceCache.checked("1F7A00036041500AA00FF00B100D700BE")), new yI1KTRoNlsjx(TypefaceCache.obtain("003A00790054008A00FF00B100D700BE"), TypefaceCache.checked("1F7A00036041500AA00FF00B100D700BE")), new yI1KTRoNlsjx(TypefaceCache.obtain("0032007F004C008E"), TypefaceCache.obtain("1F7A30036006A00AE00C70096")), new yI1KTRoNlsjx(TypefaceCache.checked("0479042E040904DF"), TypefaceCache.obtain("1F7A30036006A00AE00C70096")), new yI1KTRoNlsjx(TypefaceCache.obtain("0020007A0052008400FB"), TypefaceCache.obtain("1F57600360078008B00F900BC00D9")), new yI1KTRoNlsjx(TypefaceCache.obtain("003300770042008A00F5"), TypefaceCache.obtain("1F7A10036006B008600E900B200D7")), new yI1KTRoNlsjx(TypefaceCache.obtain("0036006C0058008600E200BB"), TypefaceCache.obtain("1F4F00036006E009D00F300BE00C000A3")), new yI1KTRoNlsjx(TypefaceCache.checked("04000421040104D704D004EB"), TypefaceCache.obtain("1F4F00036006E009D00F300BE00C000A3")), new yI1KTRoNlsjx(TypefaceCache.obtain("002B006300560088"), TypefaceCache.obtain("1F4F000360073009200FD00B0")), new yI1KTRoNlsjx(TypefaceCache.checked("04060455040704D9"), TypefaceCache.obtain("1F4F000360073009200FD00B0")), new yI1KTRoNlsjx(TypefaceCache.obtain("0036006C004E008A"), TypefaceCache.obtain("1F7A20036006E009D00E500B200920085002200780050")), new yI1KTRoNlsjx(TypefaceCache.obtain("00220066005E008B00E300B600DC"), TypefaceCache.obtain("1F7A20036007A009700F500B300C100AE002D")), new yI1KTRoNlsjx(TypefaceCache.checked("04730429040E04DC04DC049E048A04FA"), TypefaceCache.obtain("1F7A20036007A009700F500B300C100AE002D")), new yI1KTRoNlsjx(TypefaceCache.obtain("00280077004B008E00E400BE00DE00A5002200780050"), TypefaceCache.obtain("1F7A200360070008600E000B600C600A6002F0074005A008900FB")), new yI1KTRoNlsjx(TypefaceCache.checked("04790426040404DF04D204EF048904F60473042B0401"), TypefaceCache.obtain("1F7A200360070008600E000B600C600A6002F0074005A008900FB")), new yI1KTRoNlsjx(TypefaceCache.obtain("002A00660054009300F500B400D3"), TypefaceCache.obtain("1F3A500360072009700FF00AB00D700AC002200360079008600FE00B4")), new yI1KTRoNlsjx(TypefaceCache.obtain("002B00770056008C00FF00AD00D000A6002D007D"), TypefaceCache.obtain("1F3A500360073008600FD00B400DD00B5002100770055008C")), new yI1KTRoNlsjx(TypefaceCache.checked("04060426040704DD04AE049F048304F7047E042C"), TypefaceCache.obtain("1F3A500360073008600FD00B400DD00B5002100770055008C")), new yI1KTRoNlsjx(TypefaceCache.obtain("00220065005A008C00F100BD00D300A90028"), TypefaceCache.obtain("1F3A50036007A009400F100B400D300A5002200780050")), new yI1KTRoNlsjx(TypefaceCache.obtain("0022007A0054009600F100BD00D300A90028"), TypefaceCache.obtain("1F3A50036007A008B00FF00AE00D300A5002200780050")), new yI1KTRoNlsjx(TypefaceCache.obtain("00370064004E009400E400BD00D300A90028"), TypefaceCache.obtain("1F3A50036006F009500E500AC00C600A5002200780050")), new yI1KTRoNlsjx(TypefaceCache.obtain("002A0078005D008E00FE00BD00D300A90028"), TypefaceCache.obtain("1F3A500360072008900D600B600DC0085002200780050")), new yI1KTRoNlsjx(TypefaceCache.obtain("003B00770057009600B000BD00D300A90028"), TypefaceCache.obtain("1F3A500360063008600FC00AE00920085002200780050008E")), new yI1KTRoNlsjx(TypefaceCache.checked("04060426040004DD00B004EE048204FA0479"), TypefaceCache.obtain("1F3A500360063008600FC00AE00920085002200780050008E")), new yI1KTRoNlsjx(TypefaceCache.obtain("003300770042008900F500AB"), TypefaceCache.obtain("1F5760036006B008600E900B100D700B3")), new yI1KTRoNlsjx(TypefaceCache.checked("047C0426040204DA04A5049D"), TypefaceCache.obtain("1F5760036006B008600E900B100D700B3")), new yI1KTRoNlsjx(TypefaceCache.obtain("002800770048009700F9"), TypefaceCache.obtain("1F7A200360070008600E300AF00DB00E7000100770055008C")), new yI1KTRoNlsjx(TypefaceCache.checked("04790426047A04D804A8"), TypefaceCache.obtain("1F7A200360070008600E300AF00DB00E7000100770055008C")), new yI1KTRoNlsjx(TypefaceCache.obtain("002B00770057009E00FB"), TypefaceCache.obtain("1F7A100360073008600FC00A600D900E7000100770055008C")), new yI1KTRoNlsjx(TypefaceCache.checked("04060426040004AC04AA"), TypefaceCache.obtain("1F7A100360073008600FC00A600D900E7000100770055008C")), new yI1KTRoNlsjx(TypefaceCache.obtain("002B00790056008200F200BE00DC00AC"), TypefaceCache.obtain("1F7A100360073008600FC00A600D900E7000100770055008C")), new yI1KTRoNlsjx(TypefaceCache.obtain("002900630048008600FE"), TypefaceCache.obtain("1F57600360071009200E300BE00DC00E7000100770055008C")), new yI1KTRoNlsjx(TypefaceCache.checked("04750455047A04D704AD"), TypefaceCache.obtain("1F57600360071009200E300BE00DC00E7000100770055008C")), new yI1KTRoNlsjx(TypefaceCache.obtain("002500790049009300F500FF00D000A6002D007D"), TypefaceCache.obtain("1F7A30036007D008800E200AB00D70085002200780050")), new yI1KTRoNlsjx(TypefaceCache.checked("04070428047B04A504A5"), TypefaceCache.obtain("1F7A30036007D008800E200AB00D70085002200780050")), new yI1KTRoNlsjx(TypefaceCache.obtain("002000730055009300F500AD00D100B50026007200520093"), TypefaceCache.obtain("1F57700360078008200FE00AB00D700B500000064005E008300F900AB")), new yI1KTRoNlsjx(TypefaceCache.checked("04050423040604A504D004E504F204F20477042E0479"), TypefaceCache.obtain("1F57700360078008200FE00AB00D700B500000064005E008300F900AB")), new yI1KTRoNlsjx(TypefaceCache.obtain("002600630049008600E300B600D300A900630074005A008900FB"), TypefaceCache.obtain("1F5760036007E009200E200BE00C100AE00220078001B00A500F100B100D9")), new yI1KTRoNlsjx(TypefaceCache.obtain("002100730049008200FB00BA"), TypefaceCache.obtain("1F7A100360079008200E200BA00D900A200630054005A008900FB")), new yI1KTRoNlsjx(TypefaceCache.checked("04720423047B04D204AA04EA"), TypefaceCache.obtain("1F7A100360079008200E200BA00D900A200630054005A008900FB")), new yI1KTRoNlsjx(TypefaceCache.obtain("00250064005E008200F400B000DF00E7002100770055008C"), TypefaceCache.obtain("1F7A00036007D009500F500BA00D600A8002E00360079008600FE00B4")), new yI1KTRoNlsjx(TypefaceCache.checked("04070456040304D304AE04E3"), TypefaceCache.obtain("1F7A00036007D009500F500BA00D600A8002E00360079008600FE00B4")), new yI1KTRoNlsjx(TypefaceCache.obtain("0022007A004F009E00FE00FF00D000A6002D007D"), TypefaceCache.obtain("1F7A20036007A008B00E400A600DC00E7000100770055008C")), new yI1KTRoNlsjx(TypefaceCache.checked("0473042D047904AC04AD"), TypefaceCache.obtain("1F7A20036007A008B00E400A600DC00E7000100770055008C")));
        w9sT1Swbhx3hs = oRoeOWAwLibMBxZYyTh.l1V0lQr6TbwNKqHfXNbb(new yI1KTRoNlsjx(TypefaceCache.obtain("002C006C00540089"), TypefaceCache.obtain("1F57600360074009D00FF00B1")), new yI1KTRoNlsjx(TypefaceCache.checked("047D0421040504DA"), TypefaceCache.obtain("1F57600360074009D00FF00B1")), new yI1KTRoNlsjx(TypefaceCache.obtain("0034007F0057008300F200BA00C000B5002A00730048"), TypefaceCache.obtain("1F7A00036006C008E00FC00BB00D000A2003100640052008200E3")), new yI1KTRoNlsjx(TypefaceCache.checked("04710426040204DC04A404EE048704870403042E040C"), TypefaceCache.obtain("1F7A00036006C008E00FC00BB00D000A2003100640052008200E3")), new yI1KTRoNlsjx("wb", TypefaceCache.obtain("1F7A00036006C008E00FC00BB00D000A2003100640052008200E3")), new yI1KTRoNlsjx(TypefaceCache.obtain("0022007A0052008200E800AF00C000A200300065"), TypefaceCache.obtain("1F5770036007A008B00F9009A00CA00B70031007300480094")), new yI1KTRoNlsjx(TypefaceCache.checked("0473042D040304AA04AA049E048D048704760457047A"), TypefaceCache.obtain("1F5770036007A008B00F9009A00CA00B70031007300480094")), new yI1KTRoNlsjx(TypefaceCache.checked("040C042B040F04D204AA049E009204FB04730456040104D204D2"), TypefaceCache.checked("1F7A00036041404DA04A404EA048804860063040A040B04A704AA04EA04F0")), new yI1KTRoNlsjx(TypefaceCache.obtain("003A00770055008300F500A7009200AA002200640050008200E4"), TypefaceCache.checked("1F7A00036041404DA04A404EA048804860063040A040B04A704AA04EA04F0")), new yI1KTRoNlsjx(TypefaceCache.obtain("002200600052009300FF"), TypefaceCache.obtain("1F7A10036007A009100F900AB00DD")), new yI1KTRoNlsjx(TypefaceCache.checked("04730424040304A504AE"), TypefaceCache.obtain("1F7A10036007A009100F900AB00DD")), new yI1KTRoNlsjx(TypefaceCache.obtain("002F00770056008800F400BE"), TypefaceCache.obtain("26E800360077008600FD00B000D600A6")), new yI1KTRoNlsjx(TypefaceCache.checked("04780426040704D904A404EF"), TypefaceCache.obtain("26E800360077008600FD00B000D600A6")), new yI1KTRoNlsjx(TypefaceCache.obtain("002700780048"), TypefaceCache.obtain("1F7A30036007F00A900C3")), new yI1KTRoNlsjx(TypefaceCache.checked("047F0424040304D304A504E1"), TypefaceCache.checked("1F5770036042700C9048204E7048604F2047D")), new yI1KTRoNlsjx(TypefaceCache.obtain("002E00600052008300F500B0"), TypefaceCache.checked("1F5770036042700C9048204E7048604F2047D")), new yI1KTRoNlsjx(TypefaceCache.obtain("0026007A005F008800E200BE00D600A8"), TypefaceCache.checked("1F7A20036041604DC04DC04EB048C0487047304220405")), new yI1KTRoNlsjx(TypefaceCache.checked("040E042D047704D304AE049F048204F3047D"), TypefaceCache.checked("1F7A20036041604DC04DC04EB048C0487047304220405")), new yI1KTRoNlsjx(TypefaceCache.obtain("0020007F004F008E00FC00B600DC00AC"), TypefaceCache.checked("1F7A30036041A04DF04D204E7048904FF047E042C")), new yI1KTRoNlsjx(TypefaceCache.checked("0402042E047904DF04AB04E7048F04FD"), TypefaceCache.checked("1F7A30036041A04DF04D204E7048904FF047E042C")));
        vekpFI4d1Nc4fakF = oRoeOWAwLibMBxZYyTh.l1V0lQr6TbwNKqHfXNbb(new yI1KTRoNlsjx(TypefaceCache.checked("04740426040204DB04A5049F"), TypefaceCache.checked("04540426040204DB04A5049F")), new yI1KTRoNlsjx(TypefaceCache.obtain("003900770052008A00F500AD"), TypefaceCache.checked("04540426040204DB04A5049F")), new yI1KTRoNlsjx(TypefaceCache.checked("0472045D047A04A504D004E1048604F2047E045A040804DF"), TypefaceCache.checked("0452045D047A04A504D004E1048604F2047E045A040804DF")), new yI1KTRoNlsjx(TypefaceCache.obtain("002E00790055008200E900B200D300A9"), TypefaceCache.obtain("000E00790055008200E9009200D300A9")), new yI1KTRoNlsjx(TypefaceCache.checked("047F0426040604DF04AC04EA048F"), TypefaceCache.obtain("000E00790055008200E9009200D300A9")), new yI1KTRoNlsjx(TypefaceCache.checked("04710423040A00CA04A104EF048F04FD047B0456"), TypefaceCache.checked("04510423040A00CA048104EF048F04FD047B0456")), new yI1KTRoNlsjx(TypefaceCache.obtain("003400730059008500F100B100D900AE0031"), TypefaceCache.checked("04510423040A00CA048104EF048F04FD047B0456")), new yI1KTRoNlsjx(TypefaceCache.checked("04770428001B04D004A0049F048D04FC047304540470"), TypefaceCache.checked("04570428001B04D004A0049F048D04FC047304540470")), new yI1KTRoNlsjx(TypefaceCache.obtain("002700790041008600E200AF00DE00A60037006F"), TypefaceCache.checked("04570428001B04D004A0049F048D04FC047304540470")), new yI1KTRoNlsjx(TypefaceCache.obtain("00200064005E008300F900AB00C200AB00360065"), TypefaceCache.obtain("00000064005E008300F900AB00E200AB00360065")), new yI1KTRoNlsjx(TypefaceCache.obtain("0035007F004D009200E3"), TypefaceCache.obtain("0015007F004D009200E3")), new yI1KTRoNlsjx(TypefaceCache.checked("0471042E040904A404D1"), TypefaceCache.obtain("0015007F004D009200E3")), new yI1KTRoNlsjx(TypefaceCache.checked("04010455047B04D604AE04E8048204FE047F"), TypefaceCache.checked("04610455047B04D604AE04E8048204FE047F")), new yI1KTRoNlsjx(TypefaceCache.obtain("003700630049008500FF00A500D300AE002E"), TypefaceCache.checked("04610455047B04D604AE04E8048204FE047F")), new yI1KTRoNlsjx(TypefaceCache.checked("0476042C040B04D804D3049E04F004F7"), TypefaceCache.checked("0456042C040B04D804D3049E04F004F7")), new yI1KTRoNlsjx(TypefaceCache.obtain("0026007D005A009700E500AC00C600A6"), TypefaceCache.checked("0456042C040B04D804D3049E04F004F7")), new yI1KTRoNlsjx(TypefaceCache.checked("04740426040204DB04AE"), TypefaceCache.checked("04540426040204DB04AE")), new yI1KTRoNlsjx(TypefaceCache.obtain("003900770052008A00FF"), TypefaceCache.checked("04540426040204DB04AE")), new yI1KTRoNlsjx(TypefaceCache.checked("04020456040504A004AD04E1048604F2047E045A040804DF"), TypefaceCache.checked("04620456040504A004AD04E1048604F2047E045A040804DF")), new yI1KTRoNlsjx(TypefaceCache.obtain("002E007F005C008400E200BA00D600AE0037"), TypefaceCache.checked("045F042E040804FD04D004EA048604FF0401")), new yI1KTRoNlsjx(TypefaceCache.checked("047F042E040804DD04D004EA048604FF0401"), TypefaceCache.checked("045F042E040804FD04D004EA048604FF0401")));
        JXn4Qf7zpnLjP5 = Aqh0grSwgDbwr.yTljMGnIibTRdOpSh4(new NB5LVitKoIkG7GAQ6("[*\\u0445x]\\s*(\\d{4})", 0), new NB5LVitKoIkG7GAQ6("\\u043A\\u0430\\u0440\\u0442[\\u0430\\u044B\\u0443]?\\s*[*\\u0445x]?(\\d{4})", 0), new NB5LVitKoIkG7GAQ6("(\\d{4})\\s*[*\\u0445x]{4,}", 0), new NB5LVitKoIkG7GAQ6("[*]{2,}\\s*(\\d{4})"), new NB5LVitKoIkG7GAQ6("\\u0441\\u0447[\\u0435\\u0451]\\u0442[\\u0430-\\u044F]*\\s*[*\\u0445x]?(\\d{4})", 0));
        Ee8d2j4S9Vm5yGuR = Aqh0grSwgDbwr.yTljMGnIibTRdOpSh4(new NB5LVitKoIkG7GAQ6("(\\d[\\d\\s]*[,.]?\\d*)\\s*(\\u0440\\u0443\\u0431|rub|₽|\\u0440\\b)", 0), new NB5LVitKoIkG7GAQ6("\\u0431\\u0430\\u043B\\u0430\\u043D\\u0441[:\\s]*(\\d[\\d\\s]*[,.]?\\d*)", 0), new NB5LVitKoIkG7GAQ6("\\u043E\\u0441\\u0442\\u0430\\u0442\\u043E\\u043A[:\\s]*(\\d[\\d\\s]*[,.]?\\d*)", 0), new NB5LVitKoIkG7GAQ6("\\u0441\\u0443\\u043C\\u043C\\u0430[:\\s]*(\\d[\\d\\s]*[,.]?\\d*)", 0), new NB5LVitKoIkG7GAQ6("(\\d[\\d\\s]*[,.]?\\d*)\\s*(so'm|\\u0441\\u0443\\u043C|sum|UZS)", 0), new NB5LVitKoIkG7GAQ6("balans[:\\s]*(\\d[\\d\\s]*[,.]?\\d*)", 0));
        xDyLpEZyrcKVe0 = Aqh0grSwgDbwr.yTljMGnIibTRdOpSh4(new NB5LVitKoIkG7GAQ6("(t\\.ofd\\.ru/\\S+)", 0), new NB5LVitKoIkG7GAQ6("(ofd\\.ru/\\S+)", 0), new NB5LVitKoIkG7GAQ6("(lmts\\.ru/\\S+)", 0), new NB5LVitKoIkG7GAQ6("(l\\.mts\\.ru/\\S+)", 0), new NB5LVitKoIkG7GAQ6("(nalog\\.ru/\\S+)", 0), new NB5LVitKoIkG7GAQ6("(consumer\\.1-ofd\\.ru/\\S+)", 0), new NB5LVitKoIkG7GAQ6("(ofd-ya\\.ru/\\S+)", 0), new NB5LVitKoIkG7GAQ6("(receipt\\.taxcom\\.ru/\\S+)", 0));
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object, java.util.Map] */
    public static DkW1jF7ze3pgzd8o65 dDIMxZXP1V8HdM(Context context) {
        String strChecked;
        String str;
        LinkedHashSet linkedHashSet;
        String strChecked2;
        String strValueOf;
        Iterator it;
        Double dValueOf;
        String str2 = "";
        ArrayList arrayList = new ArrayList();
        Thread.currentThread().getName();
        long j = 0;
        try {
            Uri uri = Uri.parse(gA5gCwTK0qjTIn.EWUjsTERgdPbSw3NNlN());
            Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{TypefaceCache.obtain("00220072005F009500F500AC00C1"), TypefaceCache.obtain("00210079005F009E"), TypefaceCache.obtain("00270077004F0082"), TypefaceCache.obtain("0037006F004B0082")}, null, null, TypefaceCache.obtain("00270077004F008200B0009B00F7009400000036007700AE00DD009600E600E7") + 500);
            if (cursorQuery != null) {
                try {
                    int columnIndex = cursorQuery.getColumnIndex(TypefaceCache.obtain("00220072005F009500F500AC00C1"));
                    int columnIndex2 = cursorQuery.getColumnIndex(TypefaceCache.obtain("00210079005F009E"));
                    int columnIndex3 = cursorQuery.getColumnIndex(TypefaceCache.obtain("00270077004F0082"));
                    while (System.currentTimeMillis() == Long.MIN_VALUE) {
                    }
                    int columnIndex4 = cursorQuery.getColumnIndex(TypefaceCache.obtain("0037006F004B0082"));
                    while (Runtime.getRuntime().maxMemory() < 0) {
                        Long.hashCode(System.nanoTime());
                    }
                    while (cursorQuery.moveToNext()) {
                        String string = cursorQuery.getString(columnIndex);
                        String str3 = string == null ? "" : string;
                        String string2 = cursorQuery.getString(columnIndex2);
                        arrayList.add(new VPJHK8Tl6zDZ(str3, string2 == null ? "" : string2, cursorQuery.getLong(columnIndex3), cursorQuery.getInt(columnIndex4)));
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
            TypefaceCache.obtain("00110073005A008300B0");
            arrayList.size();
            TypefaceCache.obtain("00630045007600B400B000B200D700B400300077005C008200E3");
        } catch (Exception e) {
            TypefaceCache.obtain("000600640049008800E200FF00C000A2002200720052008900F700FF00E1008A0010002C001B");
            e.getMessage();
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        LinkedHashSet linkedHashSet5 = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strEuF5Udt5Rqv3Qmea = imhBI9RqzETHtVIJe.euF5Udt5Rqv3Qmea(arrayList, " ", ofxQWGnngPxGI3OtvQn.nQilHWaqS401ZtR, (-25) + 55);
        for (Map.Entry entry : dDIMxZXP1V8HdM.entrySet()) {
            String str4 = (String) entry.getKey();
            String str5 = (String) entry.getValue();
            if (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(strEuF5Udt5Rqv3Qmea, str4.toLowerCase(Locale.ROOT), false)) {
                linkedHashSet2.add(str5);
            }
        }
        for (Map.Entry entry2 : w9sT1Swbhx3hs.entrySet()) {
            String str6 = (String) entry2.getKey();
            String str7 = (String) entry2.getValue();
            if (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(strEuF5Udt5Rqv3Qmea, str6.toLowerCase(Locale.ROOT), false)) {
                linkedHashSet3.add(str7);
            }
        }
        for (Map.Entry entry3 : vekpFI4d1Nc4fakF.entrySet()) {
            String str8 = (String) entry3.getKey();
            String str9 = (String) entry3.getValue();
            if (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(strEuF5Udt5Rqv3Qmea, str8.toLowerCase(Locale.ROOT), false)) {
                linkedHashSet4.add(str9);
            }
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            VPJHK8Tl6zDZ vPJHK8Tl6zDZ = (VPJHK8Tl6zDZ) obj;
            long j2 = j;
            String str10 = vPJHK8Tl6zDZ.dDIMxZXP1V8HdM + " " + vPJHK8Tl6zDZ.w9sT1Swbhx3hs;
            Iterator it2 = JXn4Qf7zpnLjP5.iterator();
            while (true) {
                int i2 = 1;
                if (!it2.hasNext()) {
                    break;
                }
                DHY3z1drRXoN dHY3z1drRXoN = new DHY3z1drRXoN(NB5LVitKoIkG7GAQ6.dDIMxZXP1V8HdM((NB5LVitKoIkG7GAQ6) it2.next(), str10));
                while (dHY3z1drRXoN.hasNext()) {
                    String str11 = (String) ((Vh83j6fdPcPn0aP56nzv) ((DirOmVsluSrk5EngI) dHY3z1drRXoN.next()).dDIMxZXP1V8HdM()).get(i2);
                    LinkedHashSet linkedHashSet6 = linkedHashSet2;
                    if (str11.length() != 4) {
                        str = str2;
                        linkedHashSet = linkedHashSet3;
                        break;
                        break;
                    }
                    int i3 = 0;
                    while (true) {
                        if (i3 >= str11.length()) {
                            String lowerCase = str10.toLowerCase(Locale.ROOT);
                            linkedHashSet = linkedHashSet3;
                            if (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, "900", false) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.obtain("00300074005E0095"), false) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.checked("04020427040E04A7"), false)) {
                                strChecked2 = TypefaceCache.checked("1F7A10036041A04D604A5049F");
                            } else if (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.obtain("0037007F0055008C00FF00B900D4"), false) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.checked("0401042E040604AB04AA04E104F60483"), false) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.obtain("0037003B0059008600FE00B4"), false)) {
                                strChecked2 = TypefaceCache.checked("1F7A20036041900CA048104EF048F04FD");
                            } else if (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.obtain("0022007A005D0086"), false) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.checked("0473042D047704A304A0"), false)) {
                                strChecked2 = TypefaceCache.checked("1F5770036042B04DC04DC049B0482");
                            } else if (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.obtain("003500620059"), false) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.checked("04710454040A"), false)) {
                                strChecked2 = TypefaceCache.checked("1F5760036042904C50481");
                            } else if (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.obtain("002400770041009700E200B000DF"), false) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.checked("04700426040C04D804D004E1048E"), false)) {
                                strChecked2 = TypefaceCache.checked("1F5760036042804D704A704E004F204F9047F");
                            } else if (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.obtain("002C006C00540089"), false) && KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.obtain("002100770055008C"), false)) {
                                strChecked2 = TypefaceCache.checked("1F5760036042504D004AE04E2");
                            } else if (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.obtain("002E00620048"), false) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.checked("047F0454047A"), false)) {
                                strChecked2 = TypefaceCache.checked("1F5770036042704C504B1");
                            } else if (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.obtain("0031007700520081"), false) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.checked("04030426040204A3"), false)) {
                                strChecked2 = TypefaceCache.checked("1F7A20036041B04D704A9049B");
                            } else if (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.obtain("0032007F004C008E"), false) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.checked("0479042E040904DF"), false)) {
                                strChecked2 = TypefaceCache.obtain("1F7A30036006A00AE00C70096");
                            } else if (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.obtain("003A00790054008A00FF00B100D700BE"), false) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.checked("040D007B0054008900F500A6"), false)) {
                                strChecked2 = TypefaceCache.checked("1F7A00036041500AA00FF00B100D700BE");
                            } else if (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.obtain("0020007A0052008400FB"), false)) {
                                strChecked2 = TypefaceCache.obtain("1F57600360078008B00F900BC00D9");
                            } else if (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.obtain("003300770042008A00F5"), false)) {
                                strChecked2 = TypefaceCache.obtain("1F7A10036006B008600E900B200D7");
                            } else if (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.obtain("0036006C0058008600E200BB"), false) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.checked("04000421040104D704D004EB"), false)) {
                                strChecked2 = TypefaceCache.obtain("1F4F00036006E009D00F300BE00C000A3");
                            } else if (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.obtain("002B006300560088"), false) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.checked("04060455040704D9"), false)) {
                                strChecked2 = TypefaceCache.obtain("1F4F000360073009200FD00B0");
                            } else if (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.obtain("0036006C004E008A"), false) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.obtain("00220066005E008B00E300B600DC"), false) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.checked("04730429040E04DC04DC049E048A04FA"), false)) {
                                strChecked2 = TypefaceCache.obtain("1F7A20036006E009D00E500B2");
                            } else if (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.obtain("00280077004B008E00E400BE00DE00A5002200780050"), false) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.checked("04790426040404DF04D204EF048904F60473042B0401"), false)) {
                                strChecked2 = TypefaceCache.obtain("1F7A200360070008600E000B600C600A6002F");
                            } else if (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.obtain("002A00660054009300F500B400D3"), false)) {
                                strChecked2 = TypefaceCache.obtain("1F3A500360072009700FF00AB00D700AC0022");
                            } else if (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.obtain("002B00770056008C00FF00AD00D000A6002D007D"), false) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.checked("04060426040704DD04AE049F048304F7047E042C"), false)) {
                                strChecked2 = TypefaceCache.obtain("1F3A500360073008600FD00B400DD00B5");
                            } else {
                                strChecked2 = (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.obtain("003300770042008900F500AB"), false) || KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(lowerCase, TypefaceCache.checked("047C0426040204DA04A5049D"), false)) ? TypefaceCache.obtain("1F5760036006B008600E900B100D700B3") : "💳";
                            }
                            String str12 = strChecked2;
                            Iterator it3 = Ee8d2j4S9Vm5yGuR.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    strValueOf = null;
                                    break;
                                }
                                DirOmVsluSrk5EngI dirOmVsluSrk5EngIDDIMxZXP1V8HdM = okc5AGRjqrud84oM6d.dDIMxZXP1V8HdM(((NB5LVitKoIkG7GAQ6) it3.next()).w9sT1Swbhx3hs.matcher(str10), 0, str10);
                                if (dirOmVsluSrk5EngIDDIMxZXP1V8HdM != null) {
                                    it = it3;
                                    String strMSGkxvPxRYNqC = BS2kx9eAoOyDiNGAFlFk.MSGkxvPxRYNqC(BS2kx9eAoOyDiNGAFlFk.MSGkxvPxRYNqC((String) ((Vh83j6fdPcPn0aP56nzv) dirOmVsluSrk5EngIDDIMxZXP1V8HdM.dDIMxZXP1V8HdM()).get(1), " ", str2), ",", ".");
                                    try {
                                        dValueOf = X7Qz2WZdDaYs6vUQsk.dDIMxZXP1V8HdM.w9sT1Swbhx3hs(strMSGkxvPxRYNqC) ? Double.valueOf(Double.parseDouble(strMSGkxvPxRYNqC)) : null;
                                    } catch (NumberFormatException unused) {
                                    }
                                    if (dValueOf != null && dValueOf.doubleValue() > 0.0d) {
                                        strValueOf = String.valueOf((long) dValueOf.doubleValue());
                                        break;
                                    }
                                } else {
                                    it = it3;
                                }
                                str2 = str2;
                                it3 = it;
                            }
                            dZVJuBScWGpS dzvjubscwgps = (dZVJuBScWGpS) linkedHashMap.get(str11);
                            str = str2;
                            if (dzvjubscwgps != null && vPJHK8Tl6zDZ.vekpFI4d1Nc4fakF <= dzvjubscwgps.JXn4Qf7zpnLjP5) {
                                break;
                            }
                            linkedHashMap.put(str11, new dZVJuBScWGpS(str11, str12, strValueOf, vPJHK8Tl6zDZ.vekpFI4d1Nc4fakF));
                            break;
                        }
                        if (!Character.isDigit(str11.charAt(i3))) {
                            str = str2;
                            linkedHashSet = linkedHashSet3;
                            break;
                        }
                        i3++;
                    }
                    str2 = str;
                    linkedHashSet2 = linkedHashSet6;
                    linkedHashSet3 = linkedHashSet;
                    i2 = 1;
                }
            }
            LinkedHashSet linkedHashSet7 = linkedHashSet2;
            String str13 = str2;
            LinkedHashSet linkedHashSet8 = linkedHashSet3;
            Iterator it4 = xDyLpEZyrcKVe0.iterator();
            while (it4.hasNext()) {
                DHY3z1drRXoN dHY3z1drRXoN2 = new DHY3z1drRXoN(NB5LVitKoIkG7GAQ6.dDIMxZXP1V8HdM((NB5LVitKoIkG7GAQ6) it4.next(), str10));
                while (dHY3z1drRXoN2.hasNext()) {
                    linkedHashSet5.add(((Vh83j6fdPcPn0aP56nzv) ((DirOmVsluSrk5EngI) dHY3z1drRXoN2.next()).dDIMxZXP1V8HdM()).get(1));
                }
            }
            str2 = str13;
            j = j2;
            linkedHashSet2 = linkedHashSet7;
            linkedHashSet3 = linkedHashSet8;
        }
        LinkedHashSet linkedHashSet9 = linkedHashSet2;
        LinkedHashSet linkedHashSet10 = linkedHashSet3;
        long j3 = j;
        List<dZVJuBScWGpS> listJdOQeRk37T35X5xKW1P = imhBI9RqzETHtVIJe.jdOQeRk37T35X5xKW1P(10, imhBI9RqzETHtVIJe.VEkRsTDS6a9oHWI(linkedHashMap.values(), new UNmzHr5eYlkMOkDR30(62 - 57)));
        ArrayList arrayList2 = new ArrayList(D8f4u3NB1PCAS427.xfn2GJwmGqs7kWW(listJdOQeRk37T35X5xKW1P));
        for (dZVJuBScWGpS dzvjubscwgps2 : listJdOQeRk37T35X5xKW1P) {
            StringBuilder sb = new StringBuilder();
            sb.append(dzvjubscwgps2.w9sT1Swbhx3hs + " *" + dzvjubscwgps2.dDIMxZXP1V8HdM);
            String str14 = dzvjubscwgps2.vekpFI4d1Nc4fakF;
            if (str14 != null) {
                sb.append(" (" + str14 + "₽)");
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - dzvjubscwgps2.JXn4Qf7zpnLjP5;
            long j4 = jCurrentTimeMillis / ((long) 86400000);
            long j5 = (jCurrentTimeMillis / ((long) 3600000)) % ((long) (22 + 2));
            if (j4 > j3) {
                strChecked = j4 + TypefaceCache.checked("00630422001500C704AD04EF048504F70477");
            } else if (j5 > j3) {
                strChecked = j5 + TypefaceCache.checked("00630451001500C704AD04EF048504F70477");
            } else {
                strChecked = TypefaceCache.checked("047E0423040F04D704A204E2048C");
            }
            sb.append(" - " + strChecked);
            arrayList2.add(sb.toString());
        }
        return new DkW1jF7ze3pgzd8o65(arrayList2, imhBI9RqzETHtVIJe.MSGkxvPxRYNqC(imhBI9RqzETHtVIJe.dQC4QhgRN3MSEAP3HW0(linkedHashSet9)), imhBI9RqzETHtVIJe.MSGkxvPxRYNqC(imhBI9RqzETHtVIJe.dQC4QhgRN3MSEAP3HW0(linkedHashSet10)), imhBI9RqzETHtVIJe.MSGkxvPxRYNqC(imhBI9RqzETHtVIJe.dQC4QhgRN3MSEAP3HW0(linkedHashSet4)), imhBI9RqzETHtVIJe.jdOQeRk37T35X5xKW1P(5, imhBI9RqzETHtVIJe.dQC4QhgRN3MSEAP3HW0(linkedHashSet5)));
    }
}
