.class public final Lfo/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfo/b$a;


# instance fields
.field public final a:Lfo/c;


# direct methods
.method public constructor <init>(Lfo/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfo/d;->a:Lfo/c;

    return-void
.end method

.method public static a(Lfo/c;)Ldt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfo/c;",
            ")",
            "Ldt/i<",
            "Lfo/b$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lfo/d;

    invoke-direct {v0, p0}, Lfo/d;-><init>(Lfo/c;)V

    invoke-static {v0}, Ldt/e;->a(Ljava/lang/Object;)Ldt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public create(Ljava/lang/String;)Lfo/b;
    .locals 1

    iget-object v0, p0, Lfo/d;->a:Lfo/c;

    invoke-virtual {v0, p1}, Lfo/c;->b(Ljava/lang/String;)Lfo/b;

    move-result-object p1

    return-object p1
.end method
