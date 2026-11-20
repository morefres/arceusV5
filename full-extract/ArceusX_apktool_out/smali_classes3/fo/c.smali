.class public final Lfo/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Leo/e;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ldt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldt/i<",
            "Lfo/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldt/i;Ldt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Leo/e;",
            ">;",
            "Ldt/i<",
            "Lfo/a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfo/c;->a:Ldt/i;

    iput-object p2, p0, Lfo/c;->b:Ldt/i;

    return-void
.end method

.method public static a(Ldt/i;Ldt/i;)Lfo/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt/i<",
            "Leo/e;",
            ">;",
            "Ldt/i<",
            "Lfo/a;",
            ">;)",
            "Lfo/c;"
        }
    .end annotation

    new-instance v0, Lfo/c;

    invoke-direct {v0, p0, p1}, Lfo/c;-><init>(Ldt/i;Ldt/i;)V

    return-object v0
.end method

.method public static c(Ljava/lang/String;Leo/e;Lfo/a;)Lfo/b;
    .locals 1

    new-instance v0, Lfo/b;

    invoke-direct {v0, p0, p1, p2}, Lfo/b;-><init>(Ljava/lang/String;Leo/e;Lfo/a;)V

    return-object v0
.end method


# virtual methods
.method public b(Ljava/lang/String;)Lfo/b;
    .locals 2

    iget-object v0, p0, Lfo/c;->a:Ldt/i;

    invoke-interface {v0}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leo/e;

    iget-object v1, p0, Lfo/c;->b:Ldt/i;

    invoke-interface {v1}, Lft/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lfo/a;

    invoke-static {p1, v0, v1}, Lfo/c;->c(Ljava/lang/String;Leo/e;Lfo/a;)Lfo/b;

    move-result-object p1

    return-object p1
.end method
