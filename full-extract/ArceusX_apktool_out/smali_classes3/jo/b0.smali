.class public final synthetic Ljo/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lwm/k$a;

.field public final synthetic b:Lsr/a;


# direct methods
.method public synthetic constructor <init>(Lwm/k$a;Lsr/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljo/b0;->a:Lwm/k$a;

    iput-object p2, p0, Ljo/b0;->b:Lsr/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ljo/b0;->a:Lwm/k$a;

    iget-object v1, p0, Ljo/b0;->b:Lsr/a;

    check-cast p1, Lwm/r$c;

    invoke-static {v0, v1, p1}, Ljo/t0;->n(Lwm/k$a;Lsr/a;Lwm/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
