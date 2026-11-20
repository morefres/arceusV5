.class public final synthetic Lek/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lek/a$a;


# instance fields
.field public final synthetic a:Lek/c;

.field public final synthetic b:Lek/a$a;


# direct methods
.method public synthetic constructor <init>(Lek/c;Lek/a$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lek/b;->a:Lek/c;

    iput-object p2, p0, Lek/b;->b:Lek/a$a;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lek/b;->a:Lek/c;

    iget-object v1, p0, Lek/b;->b:Lek/a$a;

    invoke-static {v0, v1, p1}, Lek/c;->b(Lek/c;Lek/a$a;Ljava/lang/String;)V

    return-void
.end method
