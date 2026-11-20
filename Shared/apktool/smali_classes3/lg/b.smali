.class public final enum Llg/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Llg/b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Llg/b;

.field public static final enum b:Llg/b;

.field public static final enum c:Llg/b;

.field public static final enum d:Llg/b;

.field public static final enum e:Llg/b;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final enum f:Llg/b;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final enum g:Llg/b;

.field public static final enum h:Llg/b;

.field public static final enum i:Llg/b;

.field public static final enum j:Llg/b;

.field public static final enum k:Llg/b;

.field public static final enum l:Llg/b;

.field public static final enum m:Llg/b;

.field public static final enum n:Llg/b;

.field public static final enum o:Llg/b;

.field public static final enum p:Llg/b;

.field public static final enum q:Llg/b;

.field public static final enum r:Llg/b;

.field public static final enum s:Llg/b;

.field public static final synthetic t:[Llg/b;


# direct methods
.method static constructor <clinit>()V
    .locals 21

    new-instance v1, Llg/b;

    const-string v0, "ERROR_CORRECTION"

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Llg/b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Llg/b;->a:Llg/b;

    new-instance v2, Llg/b;

    const-string v0, "CHARACTER_SET"

    const/4 v3, 0x1

    invoke-direct {v2, v0, v3}, Llg/b;-><init>(Ljava/lang/String;I)V

    sput-object v2, Llg/b;->b:Llg/b;

    new-instance v3, Llg/b;

    const-string v0, "DATA_MATRIX_SHAPE"

    const/4 v4, 0x2

    invoke-direct {v3, v0, v4}, Llg/b;-><init>(Ljava/lang/String;I)V

    sput-object v3, Llg/b;->c:Llg/b;

    new-instance v4, Llg/b;

    const-string v0, "DATA_MATRIX_COMPACT"

    const/4 v5, 0x3

    invoke-direct {v4, v0, v5}, Llg/b;-><init>(Ljava/lang/String;I)V

    sput-object v4, Llg/b;->d:Llg/b;

    new-instance v5, Llg/b;

    const-string v0, "MIN_SIZE"

    const/4 v6, 0x4

    invoke-direct {v5, v0, v6}, Llg/b;-><init>(Ljava/lang/String;I)V

    sput-object v5, Llg/b;->e:Llg/b;

    new-instance v6, Llg/b;

    const-string v0, "MAX_SIZE"

    const/4 v7, 0x5

    invoke-direct {v6, v0, v7}, Llg/b;-><init>(Ljava/lang/String;I)V

    sput-object v6, Llg/b;->f:Llg/b;

    new-instance v7, Llg/b;

    const-string v0, "MARGIN"

    const/4 v8, 0x6

    invoke-direct {v7, v0, v8}, Llg/b;-><init>(Ljava/lang/String;I)V

    sput-object v7, Llg/b;->g:Llg/b;

    new-instance v8, Llg/b;

    const-string v0, "PDF417_COMPACT"

    const/4 v9, 0x7

    invoke-direct {v8, v0, v9}, Llg/b;-><init>(Ljava/lang/String;I)V

    sput-object v8, Llg/b;->h:Llg/b;

    new-instance v9, Llg/b;

    const-string v0, "PDF417_COMPACTION"

    const/16 v10, 0x8

    invoke-direct {v9, v0, v10}, Llg/b;-><init>(Ljava/lang/String;I)V

    sput-object v9, Llg/b;->i:Llg/b;

    new-instance v10, Llg/b;

    const-string v0, "PDF417_DIMENSIONS"

    const/16 v11, 0x9

    invoke-direct {v10, v0, v11}, Llg/b;-><init>(Ljava/lang/String;I)V

    sput-object v10, Llg/b;->j:Llg/b;

    new-instance v11, Llg/b;

    const-string v0, "PDF417_AUTO_ECI"

    const/16 v12, 0xa

    invoke-direct {v11, v0, v12}, Llg/b;-><init>(Ljava/lang/String;I)V

    sput-object v11, Llg/b;->k:Llg/b;

    new-instance v12, Llg/b;

    const-string v0, "AZTEC_LAYERS"

    const/16 v13, 0xb

    invoke-direct {v12, v0, v13}, Llg/b;-><init>(Ljava/lang/String;I)V

    sput-object v12, Llg/b;->l:Llg/b;

    new-instance v13, Llg/b;

    const-string v0, "QR_VERSION"

    const/16 v14, 0xc

    invoke-direct {v13, v0, v14}, Llg/b;-><init>(Ljava/lang/String;I)V

    sput-object v13, Llg/b;->m:Llg/b;

    new-instance v14, Llg/b;

    const-string v0, "QR_MASK_PATTERN"

    const/16 v15, 0xd

    invoke-direct {v14, v0, v15}, Llg/b;-><init>(Ljava/lang/String;I)V

    sput-object v14, Llg/b;->n:Llg/b;

    new-instance v15, Llg/b;

    const-string v0, "QR_COMPACT"

    move-object/from16 v16, v1

    const/16 v1, 0xe

    invoke-direct {v15, v0, v1}, Llg/b;-><init>(Ljava/lang/String;I)V

    sput-object v15, Llg/b;->o:Llg/b;

    new-instance v0, Llg/b;

    const-string v1, "GS1_FORMAT"

    move-object/from16 v17, v2

    const/16 v2, 0xf

    invoke-direct {v0, v1, v2}, Llg/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llg/b;->p:Llg/b;

    new-instance v1, Llg/b;

    const-string v2, "FORCE_CODE_SET"

    move-object/from16 v18, v0

    const/16 v0, 0x10

    invoke-direct {v1, v2, v0}, Llg/b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Llg/b;->q:Llg/b;

    new-instance v0, Llg/b;

    const-string v2, "FORCE_C40"

    move-object/from16 v19, v1

    const/16 v1, 0x11

    invoke-direct {v0, v2, v1}, Llg/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llg/b;->r:Llg/b;

    new-instance v1, Llg/b;

    const-string v2, "CODE128_COMPACT"

    move-object/from16 v20, v0

    const/16 v0, 0x12

    invoke-direct {v1, v2, v0}, Llg/b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Llg/b;->s:Llg/b;

    move-object/from16 v2, v17

    move-object/from16 v17, v19

    move-object/from16 v19, v1

    move-object/from16 v1, v16

    move-object/from16 v16, v18

    move-object/from16 v18, v20

    filled-new-array/range {v1 .. v19}, [Llg/b;

    move-result-object v0

    sput-object v0, Llg/b;->t:[Llg/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Llg/b;
    .locals 1

    const-class v0, Llg/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Llg/b;

    return-object p0
.end method

.method public static values()[Llg/b;
    .locals 1

    sget-object v0, Llg/b;->t:[Llg/b;

    invoke-virtual {v0}, [Llg/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Llg/b;

    return-object v0
.end method
