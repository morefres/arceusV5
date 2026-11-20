.class public final synthetic Ljo/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lsr/a;


# direct methods
.method public synthetic constructor <init>(Lsr/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljo/e0;->a:Lsr/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ljo/e0;->a:Lsr/a;

    check-cast p1, Lwm/r$c;

    invoke-static {v0, p1}, Ljo/t0;->D(Lsr/a;Lwm/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
