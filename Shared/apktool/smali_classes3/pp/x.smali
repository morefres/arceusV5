.class public final synthetic Lpp/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lym/k;


# instance fields
.field public final synthetic b:Lpp/g0;

.field public final synthetic c:Lqp/c;


# direct methods
.method public synthetic constructor <init>(Lpp/g0;Lqp/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpp/x;->b:Lpp/g0;

    iput-object p2, p0, Lpp/x;->c:Lqp/c;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Lym/y;)V
    .locals 2

    iget-object v0, p0, Lpp/x;->b:Lpp/g0;

    iget-object v1, p0, Lpp/x;->c:Lqp/c;

    check-cast p1, Lpp/g0;

    invoke-static {v0, v1, p1, p2}, Lpp/g0;->i(Lpp/g0;Lqp/c;Lpp/g0;Lym/y;)V

    return-void
.end method
