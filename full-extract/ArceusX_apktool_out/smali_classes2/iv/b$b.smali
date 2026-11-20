.class public final Liv/b$b;
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
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Liv/h<",
        "Lokhttp3/RequestBody;",
        "Lokhttp3/RequestBody;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Liv/b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Liv/b$b;

    invoke-direct {v0}, Liv/b$b;-><init>()V

    sput-object v0, Liv/b$b;->a:Liv/b$b;

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

    check-cast p1, Lokhttp3/RequestBody;

    invoke-virtual {p0, p1}, Liv/b$b;->b(Lokhttp3/RequestBody;)Lokhttp3/RequestBody;

    move-result-object p1

    return-object p1
.end method

.method public b(Lokhttp3/RequestBody;)Lokhttp3/RequestBody;
    .locals 0

    return-object p1
.end method
