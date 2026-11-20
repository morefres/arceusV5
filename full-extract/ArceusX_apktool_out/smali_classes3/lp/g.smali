.class public final Llp/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llp/e$a;


# instance fields
.field public final a:Llp/f;


# direct methods
.method public constructor <init>(Llp/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llp/g;->a:Llp/f;

    return-void
.end method

.method public static a(Llp/f;)Ldt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llp/f;",
            ")",
            "Ldt/i<",
            "Llp/e$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Llp/g;

    invoke-direct {v0, p0}, Llp/g;-><init>(Llp/f;)V

    invoke-static {v0}, Ldt/e;->a(Ljava/lang/Object;)Ldt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public create(Ljava/lang/String;)Llp/e;
    .locals 1

    iget-object v0, p0, Llp/g;->a:Llp/f;

    invoke-virtual {v0, p1}, Llp/f;->b(Ljava/lang/String;)Llp/e;

    move-result-object p1

    return-object p1
.end method
