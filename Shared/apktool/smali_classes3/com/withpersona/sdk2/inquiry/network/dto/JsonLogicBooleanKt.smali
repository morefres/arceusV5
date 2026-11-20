.class public final Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBooleanKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\"\u001b\u0010\u0005\u001a\u00020\u00008BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "Lur/i;",
        "jsonLogicEngine$delegate",
        "Lgt/h;",
        "getJsonLogicEngine",
        "()Lur/i;",
        "jsonLogicEngine",
        "network-inquiry_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final jsonLogicEngine$delegate:Lgt/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/network/dto/b;

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/b;-><init>()V

    invoke-static {v0}, Lgt/i;->b(Lkotlin/jvm/functions/Function0;)Lgt/h;

    move-result-object v0

    sput-object v0, Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBooleanKt;->jsonLogicEngine$delegate:Lgt/h;

    return-void
.end method

.method public static synthetic a()Lur/i;
    .locals 1

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBooleanKt;->jsonLogicEngine_delegate$lambda$0()Lur/i;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$getJsonLogicEngine()Lur/i;
    .locals 1

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBooleanKt;->getJsonLogicEngine()Lur/i;

    move-result-object v0

    return-object v0
.end method

.method private static final getJsonLogicEngine()Lur/i;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBooleanKt;->jsonLogicEngine$delegate:Lgt/h;

    invoke-interface {v0}, Lgt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lur/i;

    return-object v0
.end method

.method private static final jsonLogicEngine_delegate$lambda$0()Lur/i;
    .locals 3

    new-instance v0, Lur/i$a;

    invoke-direct {v0}, Lur/i$a;-><init>()V

    sget-object v1, Lur/m;->a:Lur/m;

    invoke-virtual {v1}, Lur/m;->b()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v0, v2}, Lur/i$a;->d(Ljava/util/Map;)Lur/i$a;

    move-result-object v0

    invoke-virtual {v1}, Lur/m;->a()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lur/i$a;->b(Ljava/util/Map;)Lur/i$a;

    move-result-object v0

    invoke-virtual {v0}, Lur/i$a;->e()Lur/i;

    move-result-object v0

    return-object v0
.end method
