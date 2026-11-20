.class public final Liv/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Liv/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Liv/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Liv/h<",
        "Lokhttp3/ResponseBody;",
        "Lokhttp3/ResponseBody;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Liv/b$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Liv/b$c;

    invoke-direct {v0}, Liv/b$c;-><init>()V

    sput-object v0, Liv/b$c;->a:Liv/b$c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lokhttp3/ResponseBody;

    invoke-virtual {p0, p1}, Liv/b$c;->b(Lokhttp3/ResponseBody;)Lokhttp3/ResponseBody;

    move-result-object p1

    return-object p1
.end method

.method public b(Lokhttp3/ResponseBody;)Lokhttp3/ResponseBody;
    .locals 0

    return-object p1
.end method
