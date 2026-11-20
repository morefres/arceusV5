.class public Lck/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Liv/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lck/a;->d(JLbk/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Liv/f<",
        "Lokhttp3/ResponseBody;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lbk/a;

.field public final synthetic b:Lck/a;


# direct methods
.method public constructor <init>(Lck/a;Lbk/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lck/a$a;->b:Lck/a;

    iput-object p2, p0, Lck/a$a;->a:Lbk/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Liv/d;Ljava/lang/Throwable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Liv/d<",
            "Lokhttp3/ResponseBody;",
            ">;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    iget-object p1, p0, Lck/a$a;->b:Lck/a;

    iget-object p2, p0, Lck/a$a;->a:Lbk/a;

    invoke-virtual {p1, p2}, Lck/a;->b(Lbk/a;)V

    return-void
.end method

.method public b(Liv/d;Liv/x;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Liv/d<",
            "Lokhttp3/ResponseBody;",
            ">;",
            "Liv/x<",
            "Lokhttp3/ResponseBody;",
            ">;)V"
        }
    .end annotation

    iget-object p1, p0, Lck/a$a;->b:Lck/a;

    invoke-static {p2}, Lek/y;->a(Liv/x;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Liv/x;->b()I

    move-result p2

    iget-object v1, p0, Lck/a$a;->a:Lbk/a;

    invoke-virtual {p1, v0, p2, v1}, Lck/a;->c(Ljava/lang/String;ILbk/a;)V

    return-void
.end method
